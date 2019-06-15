import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      StringBuilder sb1 = new StringBuilder(str1);
      StringBuilder sb2 = new StringBuilder(str2);
      StringBuilder temp = new StringBuilder("");
      int flag;
      int flag1 = 0;
      for(int i=0;i<2;i++)
      {
        temp.append(sb1);
      }
      for(int i=0;i<temp.length()-sb2.length();i++)
      {
        flag = 0;
        for(int j=0;j<sb2.length();j++)
        {
          if(temp.charAt(i+j)==sb2.charAt(j))          
          {
            flag++;
          }         
        }
        if(flag==sb2.length())
          flag1 = 1;
      }
      if(flag1==1)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}