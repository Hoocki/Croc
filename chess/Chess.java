package chess;

/**
 *
 * @author Romes
 */
public class Chess extends Figures {

    
    public static void main(String[] args) throws Exception{
        try{
        
            Figures pawn = new Figures(2, 2);
            System.out.println(pawn.getFigures());        
            pawn.setX(4);
            pawn.setY(6);
            System.out.println(pawn.toString());
        }        
        catch(MyException e) {
                System.err.println("Введённые параметры не соответсвуют диапазону");                
            }
        
    }
    
}
