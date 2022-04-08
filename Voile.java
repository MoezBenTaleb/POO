public class Voile {

    private String forme;
    private float epaisseur;
    public String couleur;
    protected int hauteur;

    private boolean enroule;
    private boolean deroule;
    
   final int ID6 = 6;

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

 

  public boolean enrouler(boolean enroule){
   
   return (!enroule);
   }

 public boolean derouler(boolean deroule){

   return(!deroule);

   }

}


 

