public class Voile {

    private String forme;
    private float epaisseur;
    public String couleur;
    protected float hauteur;

    private boolean enroule;
    private boolean deroule;
    
   final int ID = 5;

  public Voile(){
     
     this.couleur = "Blanc";
    
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
      return ID;
    }

  public String getForme(){
    return forme;
   }

  public void setForme(String forme){
   this.forme = forme;
   }

  public float getEpaisseur(){
    return epaisseur;
   }
 
  public void setEpaisseur(float Epaisseur){
   this.epaisseur = epaisseur;
   }

  public String getCouleur() {
   return couleur;
   }

  public void setCouleur(String couleur) {
    this.couleur = couleur;
   }

  public float getHauteur() {
    return hauteur;
   }

  public void setHauteur(float hauteur) {
   this.hauteur = hauteur;
   }

  public boolean getEnroule() {
    return enroule;
   }

   public void setEnroule(boolean enroule) {
    this.enroule = enroule;
   }

   public boolean getDeroule() {
     return deroule;
   }

   public void setDeroule(boolean deroule) {
    this.deroule = deroule;
   }

     public String toString() {
      return "La voile n°" + this.ID;
    }

}


 

