
package testmusic;

    public class MusicInstruments extends Songs implements StorageInformation {
    
        private String instrument;
        private String device;
    
    public MusicInstruments (String instrument,String actor,String song,String device){
        
        this.instrument = instrument;
        this.actor = actor;
        this.song = song;
        this.device = device;        
    }
    
    public MusicInstruments(){                      
    
        this.instrument = "default";
        this.actor = "default";
        this.song = "default";
        this.device = "default"; 
    }
    
        @Override
    public String getActor(){
        
        return actor;
    }
    
        @Override
    public String getSong(){
        
        return song;
    }    
  
    public String getInstrument(){
        
        return instrument;
    }
    
    public String equls(String instrument, String device){
        
        if (this.instrument == instrument && this.device == device){
        
            return "Воспроизведение возможно";
        
        }
        else {
            return "Воспроизведениеи невозможно";
        }
        
    } 

    @Override
    public String equls() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }    
    
}

