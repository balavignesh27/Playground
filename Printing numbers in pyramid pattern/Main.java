import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i;
      int j,l;
      int k = 1;
      for(i=1;i<=n;i++)
      {
        for(l=1;l<=n-i;l++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {          
          System.out.print(k+" ");
          k++;
        }
        System.out.println();
      }
    }    
}