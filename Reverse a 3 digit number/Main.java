import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int num1 = (num%10)*100;
    int temp = num/10;
    int num2 = (temp%10)*10;
    int num3 = temp/10;
    int sum = num1+num2+num3;
    System.out.print(sum);
  }
}