package cop2210.geometry.figures;

public class GeometryUtil
{
	
	  //Return distance between p1 and p2
      public static double getDistance(Point p1, Point p2)
      {
    	   return Math.sqrt((p2.getY() - p1.getY()) * (p2.getY() - p1.getY()) + (p2.getX() - p1.getX()) * (p2.getX() - p1.getX()));
      }
      
      
      //Returns true if p1 joined to p2 and p2 joined to p3 form a triangle
      public static boolean validTriangle(Point p1, Point p2, Point p3)
      {
     	 if(p1.equals(p2) || p1.equals(p3) || p2.equals(p3))
    		 return false;
     	 
     	 if(p1.getY() == p2.getY() && p2.getY() == p3.getY())
     		 return false;
     	 
     	 if(p1.getX() == p2.getX() && p2.getX() == p3.getX())
     		 return false;
    	
     	 return true;
      }
      
      //Returns true if p1 joined to p2 and p2 joined to p3 form two consecutive sides of a square
      public static boolean validSquare(Point p1, Point p2, Point p3, Point p4)
      {
    	 return (validRectangle(p1,p2,p3,p4) && getDistance(p1,p2) == getDistance(p2,p3));
      }
      
     //Returns true if p1 joined to p2 and p2 joined to p3 form two consecutive sides of a rectangle
     public static boolean validRectangle(Point p1, Point p2, Point p3, Point p4)
     {
    	 if(p1.equals(p2) || p1.equals(p3) || p2.equals(p3) || p2.equals(p4) || p3.equals(p4))
    		 return false;
    		 
    	 if(p1.getY() == p2.getY() && p2.getX() == p3.getX() && p3.getY() == p4.getY())
    		 return true;

    	 if(p1.getX() == p2.getX() & p2.getY() == p3.getY() && p3.getX() == p4.getX())
    		 return true;
    	
    	 return false;
     }
}
