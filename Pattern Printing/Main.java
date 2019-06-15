import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in = new Scanner(System.in);
      int row = in.nextInt();
      int column = in.nextInt();
      for(int i=1;i<=row;i++)
      {
        for(int j=column;j>column-i;j--)
        {
          System.out.print(j);
        }
        for(int j=column-i;j>=1;j--)
        {
          System.out.print(column-i+1);
        }
        System.out.println();
      }
    }
}