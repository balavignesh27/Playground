import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      prime(n);      
	}
    public static int prime(int num)
    {
      System.out.println("2");
      System.out.println("3");
      System.out.println("5");
      System.out.println("7");
      for(int i=2;i<=num;i++)
      {
        if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)
        {
          System.out.println(i);
        }
      }
      return 0;
    }
}