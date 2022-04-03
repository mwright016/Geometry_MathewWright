package cop2210.geometry.figures;

public class Rectangle extends GeometricFigure {
    //private Square
    private  double length;
    private  double width;

    //constructor
    public Rectangle ( double length, double width, String color){
        super("Rectangle" , color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    private void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }
    public double area(){
      return  length*width;
    }

    public double perimeter() {
      return  length*2 + width*2;
    }
}

