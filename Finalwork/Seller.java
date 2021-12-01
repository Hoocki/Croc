
package finalwork;
/**
 * Класс для хранения данных с файла про продавца
 */
public class Seller {
    private int id;
    private String surname;
    private String name;
    
   public Seller(){
   }
    
   public int getSeller_ID(){
   return this.id;
   }
   
   public String getSeller_surname(){
   return this.surname;
   }
   
   public String getSeller_name(){
   return this.name;
   }
   
   public void setSeller_ID(int id){
   this.id = id;
   }
   
   public void setSeller_name(String name){
   this.name = name;
   }
   
   public void setSeller_surname(String surname){
   this.surname = surname;
   }
   
  @Override
   public String toString(){
   return "Seller ID = " + this.id + "; "
           +"Seller name = " + this.name +"; "
           +"Seller surname = " + this.surname;
   }
}
