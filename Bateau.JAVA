public class Bateau{

   
    int positionX;
    int positionY;
    Coque coque;
    Cabine cabine;
    Pont pont;


   final int ID1 = 1;
 
   public Bateau(){
 
    }

   public Bateau(int positionX, int positionY, Coque coque, Cabine cabine, Pont pont){

      this.positionX = positionX;
      this.positionY = positionY;
      this.coque = coque;
      this.cabine = cabine;
      this.pont = pont;
    }

   public boolean deplacer(int positionX, int positionY){
      
    if(positionX != 0 || positionY != 0){
     return(true);}
     else return(false);

    }}
   
   
 



 
