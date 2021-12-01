
package finalwork;
/**
 * Класс для хранения данных по первому заданию
 */

public class FirstZeroVariant {
    private String product_name;    
    private String seller_name;
    private String seller_surname;
    private int amount;
    
  public FirstZeroVariant(String product,String name, String surname, int num){
      this.product_name = product;
      this.seller_name = name;
      this.seller_surname = surname;
      this.amount = num;
  }
  public  FirstZeroVariant(){
  }
  
  public String getProduct_name(){
  return this.product_name;
  }
  
  public String getSeller_name(){
  return this.seller_name;
  }
  
  public String getSeller_surname(){
  return this.seller_surname;
  }
  
  public int getAmount(){
  return this.amount;
  }

  public void setProduct_name(String name){
      this.product_name = name;
  }

  public void setSeller_name(String name){
      this.seller_name = name;
  }

  public void setSeller_surname(String surname){
      this.seller_surname = surname;
  }

  public void setAmount_name(int amount){
      this.amount = amount;
  }
  
   @Override
   public String toString(){
   return "Product = " + this.product_name + "; "
           +"Seller name = " + this.seller_name +"; "
           +"Seller surname = " + this.seller_surname + "; "
           +"Amount = " + this.amount;
   }
}
