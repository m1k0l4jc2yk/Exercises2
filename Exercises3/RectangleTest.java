
public class RectangleTest {
  public static void main(String args[]){
    Rectangle r1 = new Rectangle();
    r1.draw();
    Rectangle r2 = new Rectangle(10,10);
    System.out.println("Area of r2 rectangle is: " +r2.getArea());
    r2.draw();

  }
}
