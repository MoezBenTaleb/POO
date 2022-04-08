public class Main {

  public static void main(String[] args) {
    
   

  
    Voile voile = new Voile();

   Pont pont = new Pont();

   Cabine cabine = new Cabine();

  Coque coque = new Coque();

   Bateau bateau = new Bateau();

   pont.setVoile(voile);

   bateau.setPont(pont);
   bateau.setCabine(cabine);
   bateau.setCoque(coque);
  



    System.out.println(bateau);

}}

    
  