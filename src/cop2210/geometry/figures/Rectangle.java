package cop2210.geometry.figures;

public class Rectangle {
    //private Square
    private  double length;
    private  double width;
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    //constructor
    public Rectangle ( Point p1, Point p2, Point p3, Point p4 ){

        if(!GeometryUtil.validRectangle(p1, p2, p3, p4))
                throw new IllegalArgumentException("This is not a valid Rectangle : Check the points");

        setLength(GeometryUtil.getDistance(p3 , p4));
        setWidth(GeometryUtil.getDistance(p1 , p2));
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.p4=p4;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length  > 20 )
            throw new IllegalArgumentException("Side cannot be greater than 20");
        this.length = length;
    }

    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {
        if(width  > 20 )
            throw new IllegalArgumentException("Side cannot be greater than 20");
        this.width = width;
    }
    public double area(){
      return  length*width;
    }
}

