import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int output = power(n1,n2);
    System.out.print(output);
  }
  public static int power(int base, int exp)
  {
    int product = 1;
    for(int i=1;i<=exp;i++)
    {
      product = product*base;
    }
    return product;
  }
}