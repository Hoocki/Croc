package finalwork;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Класс для хранения данных по второму заданию
 */
public class SecondZeroVariant {
    private String date;
    private int amount;
    
  public SecondZeroVariant(){
  }
  
  public SecondZeroVariant(String date, int amount){
  this.date = date;
  this.amount = amount;
  }
   
  public int getAmount(){
  return this.amount;
  }
   
  public String getDate(){
  return this.date;
  }
  
  public void setAmount(int amount){
      this.amount = amount;
  }
  
  public void setDate(Date date){
      this.date = new SimpleDateFormat("dd.MM.yyyy").format(date);
  }
  
  @Override
   public String toString(){
   return "Date = " + this.date + "\n"           
           +"Amount = " + this.amount;
   }
}
