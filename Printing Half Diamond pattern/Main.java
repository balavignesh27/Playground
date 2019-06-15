import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i,j,k,l;
      int c = n;
      for(i=n;i>=1;i--)
      {
        
        for(j=1;j<=i-1;j++)
        {
          System.out.print(" ");
          
        }
        for(k=0;k<=c-j;k++)
        {
          System.out.print("*");
        }
        for(l=1;l<=k-1;l++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
	}
}