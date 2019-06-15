import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int com = n;
      int nc = n;
      int sum = 0;
      while(n!=0)
      {
        n = n/10;
        sum = sum+1;
      }
     
      int n1;
      int c = 0;
      while(nc!=0)
      {
        n1 = nc%10;
        c = c*10+n1;
        nc = nc/10;
      }
      
      int a;
      int out=0;
      while(c!=0)
      {
        a = c%10;
        out = out+(int)(Math.pow(a,sum));
        c = c/10;
      }
     
      if(out==com)
      {
        System.out.print("Armstrong Number");
      }
      else
      {
        System.out.print("Not a Armstrong Number");
      }

	}
}