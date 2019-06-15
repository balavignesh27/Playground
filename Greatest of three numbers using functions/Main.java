import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int output = compare(n1, n2, n3);
      System.out.print(output);
	}
    public static int compare(int num1, int num2, int num3)
    {
      int comp1 = (num1>num2)?num1:num2;
      int comp2 = (comp1>num3)?comp1:num3;
      return comp2;
    }
}