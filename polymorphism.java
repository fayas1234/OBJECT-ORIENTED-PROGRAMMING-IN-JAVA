//Program to implement polymorphism
import java.io.*;
class Poly
{
  public static void main(String args[])
  {
    Rectangle r=new Rectangle();
    Triangle t=new Triangle();
    Hexagon h=new Hexagon();
    r.numberOfSides();
    t.numberOfSides();
    h.numberOfSides();
  }

}

abstract class Shape
{
  abstract public void numberOfSides();
}

class Rectangle extends Shape
{
  public void numberOfSides()
  {
    System.out.println("The number of sides in rectangle is:4");
  }
}

class Triangle extends Shape
{
  public void numberOfSides()
  {
    System.out.println("The number of sides in triangle is:3");
  }
}

class Hexagon extends Shape
{
  public void numberOfSides()
  {
    System.out.println("The number of sides in hexagon is:6");
  }
}
