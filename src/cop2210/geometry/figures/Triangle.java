package cop2210.geometry.figures;

public class Triangle {
 //private field
   private double side1;
   private double side2;
   private double side3;
   private Point p1 , p2, p3;

 //constructor
 public Triangle ( Point p1, Point p2, Point p3){
     if(!GeometryUtil.validTriangle(p1 , p2, p3))
         throw new IllegalArgumentException("Invalid Triangle points");

         this.p1 = p1;
         this.p2 = p2;
         this.p3 = p3;
         setSide1( GeometryUtil.getDistance(p1 , p2));
         setSide2(GeometryUtil.getDistance(p2, p3));
         setSide3( GeometryUtil.getDistance(p3 ,p2));


 }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
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



    public void setSide1(double side1) {
        if(side1  > 20 )
            throw new IllegalArgumentException("Side cannot be greater than 20");
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        if(side1  > 20 )
            throw new IllegalArgumentException("Side cannot be greater than 20");
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        if(side1  > 20 )
            throw new IllegalArgumentException("Side cannot be greater than 20");
        this.side3 = side3;
    }


    public double perimeter(){
        return side1 + side2 + side3;
    }
}





