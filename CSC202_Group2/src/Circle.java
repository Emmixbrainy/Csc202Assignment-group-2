public class Circle extends Shapes {
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
        
    }
    public double calculateArea(){
    double area = Math.PI*Math.pow(radius, 2);
    
    return area;
    }
 }
