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
      return this.positionX;
    }

    public void setPositionX(int positionX) {
      this.positionX = positionX;
    }

     public int getPositionY() {
      return this.positionY;
    }

    public void setPositionY(int positionY) {
      this.positionY = positionY;
    }

  

     public Coque getCoque() {
      return this.coque;
    }

    public void setCoque(Coque coque) {
      this.coque = coque;
    }

     public Cabine getCabine() {
      return this.cabine;
    }

    public void setCabine(Cabine cabine) {
      this.cabine = cabine;
    }

     public Pont getPont() {
      return this.pont;
    }

    public void setPont(Pont pont) {
      this.pont = pont;
    }

    public int getID() {
      return this.ID;
    }

   public void deplacer(int positionX, int positionY){
      
     this.positionX = this.positionX + positionX;
     this.positionY = this.positionY + positionY;

    }


     public String toString() {
      return "Le bateau n°" + this.ID + " est constitué de:\n" + this.coque + "\n" + this.cabine + "\n" + this.pont;
    }
    
    
    }
   
   
 



 
