/*
 * Santana, Isory Marbellis
 * 10/13/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #5
                          
Problem 2. (25%) (The RegularPolygon class) In an n-sided regular polygon, all sides have the same length and all angles have the same degree (i.e. the polygon is both equilateral and equiangular). Design a class named RegularPolygon that contains:

•	A private int data field named “n” that defines the number of sides in the polygon with default value 3.
•	A private double data field named “side” that stores the length of the side with default value 1.
•	A private double data field named “x” that defines the x-coordinate of the polygon’s center with a default value of 0.
•	A private double data field named “y” that defines the y-coordinate of the polygon’s center with a default value of 0.
•	A no-arg constructor that creates a regular polygon with default values.
•	A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0,0).
•	A constructor that creates a regular polygon with the specified number of sides and length of side, and x- and y-coordinates for the center.
•	The accessor and mutator methods for all data fields.
•	The method getPerimeter() that return the perimeter of the polygon.
•	The method getArea() that returns the area of the polygon. (The formula of a polygon with n sides with length s is: (n * s2) / (4 * tan (  / n)) )

Draw the UML diagram for the class and then implement the class. Write a test program that creates three RegularPolygon objects, created using a no-arg constructor, using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6, 7.8). For each object display its perimeter and area.


*/
    
    

class RegularPolygon

{

  //Variables

  private int n;

  private double side, x, y;

  //A no-arg constructor that creates a regular polygon with default values.

  public RegularPolygon()

  {

    n=3;

    side=1;

    x=0;

    y=0;

  }

  //Implemet two arg constructor

  public RegularPolygon(int n, double side)

  {

    this.n=n;

    this.side=side;

    x=0;

    y=0;

  }

  //Implement four arg constructor

  public RegularPolygon(int n, double side, double x, double y)

  {

    this.n=n;

    this.side=side;

    this.x=x;

    this.y=y;

  }

  //Inserting the getter methods

  public int getN()

  {

    return n;

  }

  public double getSide()

  {

    return side;

  }

  public double getX()

  {

    return x;

  }

  public double getY()

  {

    return y;

  }

  //Inserting the setter methods

  public void setN(int n)

  {

    this.n=n;

  }

  public void setSide(double side)

  {

    this.side=side;

  }

  public void setX(double x)

  {

    this.x=x;

  }

  public void setY(double y)

  {

    this.y=y;

  }

  

  public double getPerimeter()

  {

    return n*side;

  }

  public double getArea()

  {

    return (n*side*side)/(4*Math.tan(Math.PI/n));

  }

}



class Problem2

{

  public static void main(String[] args)

  {

    //checking

    RegularPolygon polygons[]=new RegularPolygon[3];

    polygons[0]=new RegularPolygon();

    polygons[1]=new RegularPolygon(6, 4);

    polygons[2]=new RegularPolygon(10, 4, 5.6, 7.8);

    for(int i=0; i<polygons.length; i++)

    {

      System.out.println("Polygon's Perimeter "+(i+1)+": "+polygons[i].getPerimeter());

      System.out.println("Area of the polygon "+(i+1)+": "+polygons[i].getArea());

    }

  }

}
