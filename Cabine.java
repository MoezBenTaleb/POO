public class Cabine{

   
    boolean arret;
    int volant;
    


   final int ID4 = 4;
 
   public Cabine(){
      
     
   }

   public Cabine(boolean arret, int volant){

      this.arret = arret;
      this.volant = volant;
      
    }

   public void orienter (int volant){
      
     if (volant == -1){
         System.out.println("direction a gauche");}
      if(volant ==1){
        System.out.println("direction a droite");}
     
      
    

    }
   }
   
 