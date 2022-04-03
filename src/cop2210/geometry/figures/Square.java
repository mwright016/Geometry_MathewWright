package cop2210.geometry.figures;

public class Square extends GeometricFigure {
    //private Square
    private  double sideLength;

    //constructor
    public Square ( double sideLength, String color){
        super("Square", color);
        this.sideLength = sideLength;
    }

    //getters
    public double getSideLength() {
        return this.sideLength;
    }

    private void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double area(){
        return sideLength*sideLength;
    }

    @Override
    public double perimeter() {
        return sideLength *4;
    }
}
