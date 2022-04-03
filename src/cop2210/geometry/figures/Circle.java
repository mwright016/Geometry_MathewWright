package cop2210.geometry.figures;

//name class
public class Circle {
    // private fields
   private double radius;
   private double pi;
   private Point point;

   //constructor
    public Circle(double radius , Point centerPoint){
        this.pi = Math.PI;
        setRadius(radius);
        this.point = centerPoint;
    }
     //getters
    public double getRadius(){
        return this.radius;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getPi() {
        return pi;
    }

    public void setRadius(double radius) {
        if(radius  > 20)
            throw new IllegalArgumentException("Radius cannot be greater than 20");
        this.radius = radius;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
    public double area(){
        return pi * radius *radius;
    }

    public double perimeter(){
     return   2*radius*pi;
    }
}


