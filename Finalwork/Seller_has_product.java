
package finalwork;
/**
 * Класс для хранения данных с файла про товар в наличии у продавца
 */
public class Seller_has_product {
    private int seller_id;
    private int product_id;
    private int price;
    private int amount;
    
   public Seller_has_product(){
   }
    
   public int getSeller_ID(){
   return this.seller_id;
   }
   
   public int getProduct_ID(){
   return this.product_id;
   }
   
   public int getPrice(){
   return this.price;
   }
   public int getAmount(){
   return this.amount;
   }
   
   public void setSeller_ID(int id){
   this.seller_id = id;
   }
   
   public void setProduct_ID(int id){
   this.product_id = id;
   }
   
   public void setPrice(int price){
   this.price = price;
   }
   public void setAmount(int amount){
   this.amount = amount;
   }
   
   
  @Override
   public String toString(){
   return "Seller ID = " + this.seller_id + "; "
           +"Product ID = " + this.product_id +"; "
           +"Price = " + this.price + "; "
           +"Amount = " + this.amount;
   }
}
