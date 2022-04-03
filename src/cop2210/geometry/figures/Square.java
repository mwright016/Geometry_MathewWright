package cop2210.geometry.figures;

public class Square {
    //private Square
    private  double sideLength;
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    //constructor

    public Square ( Point p1, Point p2, Point p3, Point p4 ){

        if(!GeometryUtil.validSquare(p1, p2,p3,p4))
            throw new IllegalArgumentException("This is not a valid square : check the Points");
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.p4=p4;
        setSideLength( GeometryUtil.getDistance(p1 , p2));
    }
    //getters

    public double getSideLength() {
        return this.sideLength;
    }
    public void setSideLength(double sideLength) {
        if(sideLength  > 20 )
            throw new IllegalArgumentException("Side cannot be greater than 20");
        this.sideLength = sideLength;
    }

    public double area(){
        return sideLength*sideLength;
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
}
