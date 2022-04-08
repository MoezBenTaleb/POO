public class Voile {

    private String forme;
    private float epaisseur;
    public String couleur;
    protected int hauteur;

    private boolean enroule;
    private boolean deroule;
    
   final int ID = 5;

  public Voile(){
    
    }
    
  public Voile(String forme, float epaisseur, String couleur, int hauteur, boolean enroule, boolean deroule){
     this.forme = forme;
     this.epaisseur = epaisseur;
     this.couleur = couleur;
     this.hauteur = hauteur;
     this.enroule = enroule;
     this.deroule = deroule;
     
    }

 

  public void enrouler(boolean enroule){
   
	this.enroule = enroule;
  
   }

 public void derouler(boolean deroule){

  this.deroule = deroule;
   }

   public int getID() {
      return this.ID;
    }


     public String toString() {
      return "La voile n°" + this.ID;
    }

}


 

