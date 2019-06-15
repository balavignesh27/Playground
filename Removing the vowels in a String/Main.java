import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder temp = new StringBuilder("");
    String arr = "aeiou";
    int flag = 0;
    for(int i=0;i<sb.length();i++)
    {
      for(int j=0;j<arr.length();j++)
      {
        if(sb.charAt(i)==arr.charAt(j))
        {
          flag = 1;
        }
        
      }
      if(flag==0)
          temp.append(sb.charAt(i));
        flag = 0;
    }
    System.out.print(temp);
  }
}