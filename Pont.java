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
      return this.longueur;
    }

    public void setLongueur(float longueur) {
      this.longueur = longueur;
    }

    public float getLargeur() {
      return this.largeur;
    }

    public void setLargeur(float largeur) {
      this.largeur = largeur;
    }

    public Voile getVoile() {
      return this.voile;
    }

    public void setVoile(Voile voile) {
      this.voile = voile;
    }

    public int getID() {
      return this.ID;
    }

    
   public float getSurface (){
      
     
     return this.longueur * this.largeur;
     
    }


    public String toString() {
      return "Le pont n°" + this.ID + " est constitué de la Voile n°" + this.voile.getID();
    }
    
   } 