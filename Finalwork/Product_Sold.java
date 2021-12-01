package finalwork;
import java.util.Date;
/**
 * Класс для хранения данных с файла про продаж
 */
public class Product_Sold {
    private int sold_id;
    private int seller_id;
    private int product_id;
    private int amount;
    private Date date;
    
   public Product_Sold(){
   }
   
   public int getSold_ID(){
   return this.sold_id;
   }
   
   public int getSeller_ID(){
   return this.seller_id;
   }
   
   public int getProduct_ID(){
   return this.product_id;
   }
   
   public Date getDate(){
   return this.date;
   }
   public int getAmount(){
   return this.amount;
   }
   
   public void setSold_ID(int id){
   this.sold_id = id;
   }
   
   public void setSeller_ID(int id){
   this.seller_id = id;
   }
   
   public void setProduct_ID(int id){
   this.product_id = id;
   }
   
   public void setDate(Date date){
   this.date = date;
   }
   public void setAmount(int amount){
   this.amount = amount;
   }
   
   
  @Override
   public String toString(){
   return "Seller ID = " + this.seller_id + "; "
           +"Product ID = " + this.product_id +"; "
           +"Sold ID = " + this.sold_id + "; "
           +"Amount = " + this.amount + "; "
           +"Date = " + this.date;
   }
    
}
