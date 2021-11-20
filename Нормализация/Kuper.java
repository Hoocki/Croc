package kuper;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.Deque;

public class Kuper {
    
        public static String Normalize(String str){
        String[] mass = str.split("/");                                               // создание массива строк для дальнейшей обработки в деке              
        Deque<String> pathnew = new ArrayDeque<>();
        
          for(String i : mass){
              if(i.equals("..")){
                  
                  if(pathnew.isEmpty() || pathnew.getLast().equals("..")){            // проверка если дек не пустой или последний элемент является ".."
                      pathnew.add(i);
                  }
                  else{
                      if(pathnew.getLast().charAt(pathnew.getLast().length()-1)!=':'){ // проверка что в последнем элементе дека, последний элемент не ":"
                      pathnew.removeLast();
                        }
                  }
              }
              else if (i.equals(".")){                                                // пустая обработка "."
              
              }
              else {                                                                 // добавление элемента в дек 
            pathnew.add(i); 
              }
          }
          String ans = "";
              for(String i : pathnew){                                              // возвращение строки с ответом            
              ans += i + "/";
          }
              return ans;
        } 

    public static void main(String[] args) {
        String str = "КРОК/task_6_2/src/./../../task_6_1/../../../мемы/котики";        
        System.out.println(Normalize(str));                      
          
    }
    
   
}
