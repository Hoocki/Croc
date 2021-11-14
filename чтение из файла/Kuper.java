package kuper;
import java.io.*;


public class Kuper {

   
     public static void main(String[] args) throws Exception{
        try(Reader file = new BufferedReader(new FileReader("input.txt"))){
          int sum_words = 0;
          int symbol;
          char last_symbol=' ';
          while((symbol = file.read()) != -1){
                if((char)symbol == ' ' && last_symbol != ' '||
                   (char)symbol == '.' || (char)symbol=='!' ||
                   (char)symbol == '?' || (char)symbol=='\n'){
                    sum_words += 1;                   
                }                
                last_symbol = (char)symbol;               
            }
            System.out.print(sum_words);
        }        
        catch(IllegalArgumentException e) {
                System.err.println("Путь к файду не задан");                
            }
        catch (FileNotFoundException e){
                System.err.println("Ошибка чтения файла");
            }
        
    }
    
}
