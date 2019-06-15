import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int com = n;
      int n1;
      int sum = 1;
      int out = 0;
      while(n!=0)
      {
        sum = 1;
        n1 = n%10;
        for(int i=1;i<=n1;i++)
        {
          sum = sum*i;
        }
        n = n/10;
        out = out+sum;
      }
      if(out==com)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
	}
}