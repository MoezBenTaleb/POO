public class Pont{

   
    private float longueur;
    private float largeur;
    private Voile voile;
    
    
    final int ID = 4;
 
   public Pont(){
      
     this.longueur = 5;
     this.largeur = 7;
   }

   public Pont(float longueur, float largeur,Voile voile){

      this.longueur = longueur;
      this.largeur = largeur;
      this.voile = voile;
      
    }

    public float getLongueur() {
      return longueur;
    }

    public void setLongueur(float longueur) {
      this.longueur = longueur;
    }

    public float getLargeur() {
      return largeur;
    }

    public void setLargeur(float largeur) {
      this.largeur = largeur;
    }

    public Voile getVoile() {
      return voile;
    }

    public void setVoile(Voile voile) {
      this.voile = voile;
    }

    public int getID() {
      return ID;
    }

    
   public float calculerSurface (){
      
     
     return this.longueur * this.largeur;
     
    }


    public String toString() {
      return "Le pont numero " + this.ID + " est constitue de la Voile numero " + this.voile.getID();
    }
    
   } 
