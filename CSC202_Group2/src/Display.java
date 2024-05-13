import javax.swing.*;
public class Display extends JFrame {
  
        
    
    public static void main(String[] args) {
    String input = JOptionPane.showInputDialog(null,"Select Shape\n1.Circle\n 2.Triangle\n 3. Rectangle\n 4.Cube\n 5.Sphere");
    int inputDisplay = Integer.parseInt(input);
        switch(inputDisplay){
          case 1:
              String inputCircle = JOptionPane.showInputDialog(null,"Enter radius ");
              double r = Double.parseDouble(inputCircle);
              Circle circleShape = new Circle(r);
              JOptionPane.showMessageDialog(null, "The Area of Circle is: "+circleShape.calculateArea()+"CM");
          break;
          case 2:
              String inputTriangleBase = JOptionPane.showInputDialog(null,"Enter Base");
              double base = Double.parseDouble(inputTriangleBase);
              String inputTriangleHeight = JOptionPane.showInputDialog(null,"Enter Hieght");
              double height = Double.parseDouble(inputTriangleHeight);
              
              Triangle triangleShape = new Triangle(base, height);
              JOptionPane.showMessageDialog(null, "The Area of Triangle is: "+triangleShape.calculateArea()+"CM");

         break;
          case 3:
              String inputRectangleLength =JOptionPane.showInputDialog(null, "Enter Length");
              double l = Double.parseDouble(inputRectangleLength);
              String inputRectangleBreadth =JOptionPane.showInputDialog(null, "Enter Breadth");
              double b = Double.parseDouble(inputRectangleLength);
              Rectangle rectangleShape = new Rectangle(l, b);
              JOptionPane.showMessageDialog(null, "The Area of rectangle is: "+rectangleShape.calculateArea()+"CM");
         break;
          case 4:
            String inputCubeSideLength =JOptionPane.showInputDialog(null, "Enter Side Length");
              double sl =Double.parseDouble(inputCubeSideLength);
              Cube cubeShape = new Cube((sl));
             JOptionPane.showMessageDialog(null, "The Volume of Cube is: "+cubeShape.calculateVolume()+" dm^3");
         break;
          case 5:
            String inputSphereRadius =JOptionPane.showInputDialog(null, "Enter Radius");
              double sr = Double.parseDouble(inputSphereRadius);
              Sphere sphereShape = new Sphere(sr);
              JOptionPane.showMessageDialog(null, "The Volume of Sphere is: "+sphereShape.calculateVolume()+" dm^3");
         break;
          default:
              JOptionPane.showMessageDialog(null, "We dont' have the type of shape");
              
       }
     
      
        
        
       
    }
   
}
