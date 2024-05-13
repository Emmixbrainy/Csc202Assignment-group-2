public class Triangle extends Shapes {
    private double base;
    private double hieght;
    
    public Triangle(double base, double hieght){
    this.base = base;
    this.hieght = hieght;
    
    }
   public double calculateArea(){
      double area = base*hieght;
       return 0.5*area;
               
   }
}
