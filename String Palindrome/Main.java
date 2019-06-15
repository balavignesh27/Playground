import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();      
      int count = 1;
      int flag = 0;
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)==str.charAt(str.length()-count))
        {
          flag = 1;
        }
        else
          flag = 0;
        count++;
      }
      if(flag==1)
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}