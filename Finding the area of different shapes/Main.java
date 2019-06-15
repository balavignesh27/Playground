import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      switch(num)
      {
        case 1:
          	int side = in.nextInt();
          	System.out.println(square(side));
          	break;
        case 2:
          	int length = in.nextInt();
          	int breadth = in.nextInt();
          	System.out.println(rectangle(length, breadth));
          	break;
        case 3:
          	int base = in.nextInt();
          	int height = in.nextInt();
          	System.out.println(triangle(base, height));
          	break;
         case 4:
          	int radius = in.nextInt();          	
          	System.out.println(circle(radius));
          	break;
      }
    }
  	public static int square(int side)
    {
      int area = side*side;
      return area;
    }
  	public static int rectangle(int length, int breadth)
    {
      int area = length * breadth;
      return area;
    }
  	public static int triangle(int base, int height)
    {
      int area = (base * height)/2;
      return area;
    }
  	public static double circle(int radius)
    {
      double area = (double)(3.14*radius*radius);
      return area;
    }
}