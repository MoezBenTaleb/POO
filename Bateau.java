public class Bateau{

   
    int positionX;
    int positionY;
    Coque coque;
    Cabine cabine;
    Pont pont;


   final int ID = 1;
 
   public Bateau(){
        this.positionX = 5;
        this.positionY = 7;

    }

   public Bateau(int positionX, int positionY, Coque coque, Cabine cabine, Pont pont){

      this.positionX = positionX;
      this.positionY = positionY;
      this.coque = coque;
      this.cabine = cabine;
      this.pont = pont;
    }

     public int getPositionX() {
      return positionX;
    }

    public void setPositionX(int positionX) {
      this.positionX = positionX;
    }

     public int getPositionY() {
      return positionY;
    }

    public void setPositionY(int positionY) {
      this.positionY = positionY;
    }

  

     public Coque getCoque() {
      return coque;
    }

    public void setCoque(Coque coque) {
      this.coque = coque;
    }

     public Cabine getCabine() {
      return cabine;
    }

    public void setCabine(Cabine cabine) {
      this.cabine = cabine;
    }

     public Pont getPont() {
      return pont;
    }

    public void setPont(Pont pont) {
      this.pont = pont;
    }

    public int getID() {
      return ID;
    }

   public void deplacer(int positionX, int positionY){
      
     this.positionX = this.positionX + positionX;
     this.positionY = this.positionY + positionY;

    }


     public String toString() {
      return "Le bateau numero " + this.ID + " est constitue de:\n" + this.coque + "\n" + this.cabine + "\n" + this.pont;
    }
    
    
    }
