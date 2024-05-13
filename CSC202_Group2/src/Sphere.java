
public class Sphere extends Shapes{
private double radius, dimention;

public Sphere(double radius){
    
    this.radius= radius;
    this.dimention = dimention;
}
public double calculateArea(){
    
       double area = 6*Math.pow(dimention, radius);
        return area;
}
public double calculateVolume(){
    
    double volume = (4/3)*Math.PI*Math.pow(radius, 3);
    return volume ;
    
}
}
