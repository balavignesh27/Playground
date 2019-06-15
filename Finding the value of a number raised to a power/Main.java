import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exp = in.nextInt();
      int product = 1;
      while(exp>=1)
      {
        product = product * base;
        exp--;
      }
      System.out.println(product);
    }
}