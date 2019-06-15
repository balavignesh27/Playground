import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int num1 = num%100;
      int num2 = num1/10;
      System.out.print(num2);
	}
}