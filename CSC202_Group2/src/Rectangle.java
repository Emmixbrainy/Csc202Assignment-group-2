
public class Rectangle extends Shapes {
    private double length;
    private double breadth;
    
  public  Rectangle(double length, double breadth){
    this.breadth =breadth;
    this.length =length;  
    }
   public double calculateArea(){
      double area = length*breadth;
       return area;
   } 
}
