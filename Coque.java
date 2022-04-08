public class Coque {

   
    private int epaisseur;
    public boolean etancheite;
    
    final int ID = 2;

  public Coque(){
      this.epaisseur = 3;
      this.etancheite = true;
    }
    
  public Coque(int epaisseur, boolean etancheite){
     this.epaisseur = epaisseur;
     this.etancheite = etancheite;
    
    }

 

  public boolean couler(){
   
   return (false);
   }

   public int getID() {
      return this.ID;
    }

    public String toString() {
      return "Le coque n°" + this.ID;
    }



   

}

