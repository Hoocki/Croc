package testmusic;

/**
 *
 * @author Romes
 */
public class TestMusic extends MusicInstruments {
    
    public static void main(String[] args) {
        
        MusicInstruments a = new MusicInstruments("CD","Static-X","The Only","cd");
       
         System.out.println(a.getActor());
         System.out.println(a.getSong());
         System.out.println(a.getInstrument());
         System.out.println(a.equls("CD", "cd"));    
    }
    
}
