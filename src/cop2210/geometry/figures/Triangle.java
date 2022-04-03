package cop2210.geometry.figures;

public class Triangle extends GeometricFigure {
 //private field
   private double side1;
   private double side2;
   private double side3;
   private double height;

 //constructor
 public Triangle (double height, double side1 ,double side2, double side3, String color){
     super("Triangle", color);
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
     this.height = height;
 }
 //getters
    public double getSide1() {
        return this.side1;
    }
    public double getSide2(){
            return this.side2;
        }
    public double getSide3() {
        return this.side3;
    }

    public double getHeight(){
     return this.height;
 }

    private void setSide1(double side1) {
        this.side1 = side1;
    }

    private void setSide2(double side2) {
        this.side2 = side2;
    }

    private void setSide3(double side3) {
        this.side3 = side3;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double area(){
     return (side1 * height)/2;
    }

    public double perimeter(){
        return side1 + side2 + side3;
    }
}





