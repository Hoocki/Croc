package chess;

/**
 *
 * @author Romes
 */
public class Figures {
    
        private int x;
        private int y;
    
    public Figures (int symbol, int number)throws Exception{
            
            if (x > 9 || x < 0 || y < 0 || y > 9 ){
                throw new MyException("Введённые параметры не соответсвуют диапазону: " + x + " " + y );
            }
            try {       
                this.x = symbol;
                this.y = number;
            }
            catch(IllegalArgumentException e) {
                System.err.println("Неверный ввод данных");                
            }
            
    }
    
    public Figures (){
            
            this.x = 1;
            this.y = 1;
    }
    
    public String getFigures(){
    
            return ("Коорлинаты фигуры: " + x + " " + y);
    }
    
    public void setX(int x) throws Exception{
    
            if (x > 9 || x < 0){
                throw new MyException("Введённый параметр не соответсвует диапазону: " + x);
            }
            try {                
                this.x = x;           
            }
            catch(IllegalArgumentException e) {
                System.err.println("Неверный ввод данных");                
            }
                        
    }
    
    public void setY(int y) throws Exception{
    
            if (y > 9 || y < 0){
                throw new MyException("Введённый параметр не соответсвует диапазону: " + y);
            }
            try {                
                this.y = y;           
            }
            catch(IllegalArgumentException e) {
                System.err.println("Неверный ввод данных");                
            }
                        
    }
    
        @Override
    public String toString(){
            
            char str = ' ';
            if(x == 1){str = 'a';}
            else if (x == 2){str = 'b';}
            else if (x == 3){str = 'c';}
            else if (x == 4){str = 'd';}
            else if (x == 5){str = 'e';}
            else if (x == 6){str = 'f';}
            else if (x == 7){str = 'g';}
            else if (x == 8){str = 'h';}
            
        return String.format("(%c,%d)",str,y);
        
    }
    
    
}
