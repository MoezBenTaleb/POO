public class Pont{

   
    int longueur;
    int largeur;
    Voile voile;
    


   final int ID3 = 3;
 
   public Pont(){
      
     
   }

   public Pont(int longueur, int largeur,Voile voile){

      this.longueur = longueur;
      this.largeur = largeur;
      this.voile = voile;
      
    }

   public boolean supporter (){
      
     
     return true;
     
    }
   }