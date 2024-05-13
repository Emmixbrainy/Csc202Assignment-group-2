public class Cube extends Shapes {
    
    private double sideLength;
    
    public Cube(double sideLength){
     this.sideLength = sideLength;
    }
    
    
  public double  calculateVolume(){
      double volume = Math.pow(sideLength, 3);
          return volume ;
  }  
}
