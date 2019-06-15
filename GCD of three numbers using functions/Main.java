import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int output = gcd(n1, n2, n3);
      System.out.print(output);
	}
    public static int gcd(int num1, int num2, int num3)
    {
      int gc=1;
      int min = (num1<num2)?num1:num2;
      min = (min<num3)?min:num3;
      for(int i=1;i<=min;i++)
      {
        if(num1%i==0 && num2%i==0 && num3%i==0)
        {
          gc=i;
        }
      }
      return gc;
    }
}