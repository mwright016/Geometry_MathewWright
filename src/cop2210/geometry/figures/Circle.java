package cop2210.geometry.figures;

//name class
public class Circle extends GeometricFigure{

    // private fields
   private double radius;
   private double pi;

   //constructor
    public Circle(double radius, String color){
        super("Circle", color);
        this.pi = Math.PI;
        this.radius = radius;
    }
     //getters
    public double getRadius(){
        return this.radius;
    }


    public double getPi() {
        return pi;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    private void setPi(double pi) {
        this.pi = pi;
    }
    public double area(){
        return pi * radius *radius;
    }

    public double perimeter(){
     return   2*radius*pi;
    }


}


