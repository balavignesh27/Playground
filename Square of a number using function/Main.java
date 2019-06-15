import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int output = square(n);
     System.out.print(output); 
	} 
    public static int square(int num)
    {
      int product = num*num;
      return product;
    }
}