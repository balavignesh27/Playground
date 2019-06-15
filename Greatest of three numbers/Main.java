import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      int num3 = in.nextInt();
      int out;
      if(num1>num2)
      {
        out = num1;
      }
      if(num1>num3)
      {
        out = num1;
      }
      else
      {
        out = num3;
      }
      
       System.out.print(out);
    }
}