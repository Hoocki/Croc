package kuper;
import java.io.*;


public class Kuper {

   
     public static void main(String[] args) throws Exception{
        try(Reader file = new BufferedReader(new FileReader("input.txt"))){     // открытие потока для чтения
          int sum_words = 0;                                                    
          int symbol;                                                           // текущий символ
          char last_symbol=' ';                                                 // предыдущий символ
          while((symbol = file.read()) != -1){                                  // чтение символов
                if((char)symbol == ' ' && last_symbol != ' '||                  // проверка на конец строки, предложения и на окончание слова
                   (char)symbol == '.' || (char)symbol=='!' ||
                   (char)symbol == '?' || (char)symbol=='\n'){
                    sum_words += 1;                   
                }                
                last_symbol = (char)symbol;                                     // запоминаю текущий символ как последний                                     
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
