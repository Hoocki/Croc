package finalwork;
/**
 * Класс для хранения данных с файла про товар
 */
public class Product {
  private  int id;
  private  String product_name;
    
   public Product(){   
   }
   
   public int getProduct_ID(){
   return this.id;
   }
   
   public String getProduct_name(){
   return this.product_name;
   }
   
   public void setID(int id){
   this.id = id;
   }
   
   public void setProduct_name(String name){
   this.product_name = name;
   }
   
  @Override
   public String toString(){
   return "Product ID = " + this.id + "; "
           +"Product name = " + this.product_name;
   }
    
}
