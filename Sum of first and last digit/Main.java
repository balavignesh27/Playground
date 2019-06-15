import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int last = n%10;
      int n1 = 0;
      while(n>0)
      {
        n = n/10;
        if(n!=0)
        {
          n1 = n%10;
        }
      }
      int sum = n1+last;
      System.out.print(sum);
	}
}