import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String sub = in.nextLine();
    int count = 0;
    for(int i=0;i<(str.length()-sub.length());i++)
    {
      for(int j=0;j<sub.length();j++)
      {
        if(str.charAt(i+j)==sub.charAt(j))
        {
          count++;
        }
      }
    }
    System.out.print(count-1);
  } 
}