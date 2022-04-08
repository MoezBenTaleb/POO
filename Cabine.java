public class Cabine{

   
    int surface;

    int volant;
    


   final int ID = 3;
 
   public Cabine(){
      
     
   }

   public Cabine(int surface, int volant){

      this.surface = surface;
        this.volant = volant;
      
    }

     public int getSurface() {
      return this.surface;
    }

    public void setSurface(int surface) {
      this.surface = surface;
    }

     public int getVolant() {
      return this.volant;
    }

    public void setVolant(int volant) {
      this.volant = volant;
    }

    public int getID() {
      return this.ID;
    }

   public void orienter (int volant){
      
     if (volant == -1){
         System.out.println("direction a gauche");}
      if(volant ==1){
        System.out.println("direction a droite");}
     
    

    }

    public String toString() {
      return "La cabine n°" +     this.ID;
    }
   }
   
 