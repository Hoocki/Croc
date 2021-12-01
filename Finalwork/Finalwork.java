package finalwork;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
/**
 *
 * @author Romes
 */
public class Finalwork {      
     
    public static String getSellerName(Seller[] mass, int id){                  
        for(Seller i : mass){
            if(i.getSeller_ID() == id){
                return i.getSeller_name();
            }
        }
        return "Такого продавца нет";
    }
    
    public static String getSellerSurName(Seller[] mass, int id){
        for(Seller i : mass){
            if(i.getSeller_ID() == id){
                return i.getSeller_surname();
            }
        }
        return "Такого продавца нет";
    }
    
    
    public static void FirstProblem(Product[] mass1, Seller_has_product[] mass2, Seller[] mass3){        
    List<FirstZeroVariant> mass = new LinkedList<>();
    MaxProducts items = new MaxProducts();
        int mx = 0;
        int id = 0;        
        for(Product i : mass1){                                                 //поиск наибольшего количество продуктов у продавца
            mx = 0;
            id = 0;
            for(Seller_has_product j : mass2){                                  
                if(i.getProduct_ID()==j.getProduct_ID()){                           
                    if(j.getAmount() > mx){                                     
                    mx = j.getAmount();
                    id = j.getSeller_ID();                                                     
                    }
                }
            }
       if(mx>0){
            String name = getSellerName(mass3,id);                              
            String surname = getSellerSurName(mass3,id);       
            mass.add(new FirstZeroVariant(i.getProduct_name(),name,surname,mx));// добавление в лист продавца имеющий наибольшее количество данного товара                  
            }
        }

    try {
                                                                                // create new `Document`
    DocumentBuilder builder = DocumentBuilderFactory.newInstance()              
            .newDocumentBuilder();
    Document dom = builder.newDocument();
                                                                                // first create root element
    Element root = dom.createElement("MaxProduct");
    dom.appendChild(root);
    for(FirstZeroVariant i : mass){        
   
                                                                                // now create child elements
    Element prod_name = dom.createElement("product_name");    
    Element name = dom.createElement("seller_name");
    name.setTextContent(i.getSeller_name());
    Element surname = dom.createElement("seller_surname");
    surname.setTextContent(i.getSeller_surname());
    Element amount = dom.createElement("amount");
    amount.setTextContent(i.getAmount()+"");
                                                                                // create attribute for prod_name
      Attr attr = dom.createAttribute("name");
      attr.setValue(i.getProduct_name());
     
    
                                                                                // add child nodes to root node
    root.appendChild(prod_name);
    prod_name.appendChild(name);
    prod_name.setAttributeNode(attr);
    prod_name.appendChild(surname);
    prod_name.appendChild(amount);    
    }

                                                                                // write DOM to XML file
    Transformer tr = TransformerFactory.newInstance().newTransformer();
    tr.setOutputProperty(OutputKeys.INDENT, "yes");
    tr.transform(new DOMSource(dom), new StreamResult(new File("output/first.xml")));

} catch (IllegalArgumentException | ParserConfigurationException | TransformerException | DOMException ex) {
    System.out.println("Ошибка воспроизведение файла");
}
       
    }
    
    public static int AmountSell(Product_Sold[] mass4, Date date){              // количество всех элементов проданных в данную дату
        int sum = 0;
        for(Product_Sold i : mass4){
            if(i.getDate().equals(date)){
            sum += i.getAmount();
            }
        }
        return sum;
    }
    
  
public static void SecondProblem(Product_Sold[] mass4){        
        Map<Date,Integer> map = new HashMap<>();
		for (Product_Sold i : mass4) {
			Date date = i.getDate();
			if (!map.containsKey(date))
				map.put(date, AmountSell(mass4,date));          // складываю в map все даты
                                
		}
        List<SecondZeroVariant> mass = new ArrayList<>();
                for(Map.Entry<Date, Integer> i : map.entrySet()){
                  SecondZeroVariant  item = new SecondZeroVariant();            // конвертирую из map в SecondZeroVariant
                  mass.add(item);
                  item.setDate((Date)i.getKey());
                  item.setAmount(i.getValue());
                }
        try {
                                                                                // create new `Document`
    DocumentBuilder builder = DocumentBuilderFactory.newInstance()
            .newDocumentBuilder();
    Document dom = builder.newDocument();
                                                                                // first create root element
    Element root = dom.createElement("AmountSell");
    dom.appendChild(root);
    for(SecondZeroVariant i : mass){         
                                                                                
    
                                                                                // now create child elements (name, email, phone)
    Element date = dom.createElement("Date");   
    Element amount = dom.createElement("amount");
    amount.setTextContent(i.getAmount()+"");
    
      Attr attr = dom.createAttribute("name");                                  // set 'name' attribute to root element
      attr.setValue(i.getDate());
     
    
                                                                                // add child nodes to root node
    root.appendChild(date);
    date.appendChild(amount);
    date.setAttributeNode(attr);      
    }

                                                                                // write DOM to XML file
    Transformer tr = TransformerFactory.newInstance().newTransformer();
    tr.setOutputProperty(OutputKeys.INDENT, "yes");
    tr.transform(new DOMSource(dom), new StreamResult(new File("output/second.xml")));

} catch (IllegalArgumentException | ParserConfigurationException | TransformerException | DOMException ex) {
            System.out.println("Ошибка воспроизведение файла");
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
       JsonReader input1 = new JsonReader(new FileReader("files/product.json"));
       JsonReader input2 = new JsonReader(new FileReader("files/seller.json"));                              
       JsonReader input3 = new JsonReader(new FileReader("files/sellerproduct.json"));   // считывание из файлов JSON        
       JsonReader input4 = new JsonReader(new FileReader("files/productsold.json"));
       Gson gson = new GsonBuilder().setDateFormat("dd.MM.yyyy").create();
       
       Product[] prod_mass = gson.fromJson(input1, Product[].class);
       Seller[] seller_mass = gson.fromJson(input2, Seller[].class);
       Seller_has_product[] sell_prod_mass = gson.fromJson(input3, Seller_has_product[].class); // заполнение экземпляров данными
       Product_Sold[] prod_sold_mass = gson.fromJson(input4, Product_Sold[].class);             
       input1.close();
       input2.close();                                                          
       input3.close();
       input4.close();
       
       FirstProblem(prod_mass,sell_prod_mass,seller_mass);       
       SecondProblem(prod_sold_mass);       

    }
    
}
