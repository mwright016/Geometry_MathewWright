package cop2210.geometry.figures;

public class Point {
    //attributes
    private int x;
    private int y;

    //constructor that takes x and y coordinates
    public Point(int x, int y) {
        //set the x and y coordinates using the setter methods
        setX(x);
        setY(y);
    }

    //getter for x
    public int getX() {
        return x;
    }

    //getter for y
    public int getY() {
        return y;
    }

    //setter for x
    public void setX(int x) {
        //assign the x value if it is between -100 and 100
        if (x >= -100 && x <= 100)
            this.x = x;
            //otherwise throw an exception
        else
            throw new IllegalArgumentException("X must be between -100 and 100");
    }

    //setter for y
    public void setY(int y) {
        //assign the y value if it is between -100 and 100
        if (y >= -100 && y <= 100)
            this.y = y;
            //otherwise throw an exception
        else
            throw new IllegalArgumentException("Y must be between -100 and 100");
    }

    @Override
    public boolean equals(Object o) {
        //if the object is null or not a Point, return false
        if (o == null || getClass() != o.getClass())
            return false;
        //otherwise, cast the object to a Point
        Point point = (Point) o;
        //return true if the x and y coordinates are equal
        return x == point.x && y == point.y;
    }

    //returns a string representation of the point, in the form (x, y), used for testing
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    //code for testing
    public static void main(String[] args) {
        //creating two points
        Point p1 = new Point(2, 5);
        Point p2 = new Point(4, 5);

        //printing the points
        System.out.println("p1: "+p1);
        System.out.println("p2: "+p2);
        //testing equals method
        System.out.println(p1.equals(p2)); //false
        //changing x of p2 to 2
        p2.setX(2);
        //both points should be equal by now.
        System.out.println("p2: "+p2);
        System.out.println(p1.equals(p2));
    }
}