import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      String str3 = in.nextLine();
      StringBuilder sb1 = new StringBuilder(str1);
      StringBuilder sb2 = new StringBuilder(str2);
      StringBuilder sb3 = new StringBuilder(str3);
      StringBuilder temp = new StringBuilder("");
      int flag;
      int sb2_length = sb2.length();
      
      for(int i=0;i<sb1.length();i++)
      {
        flag = 0;
        for(int j=0;j<sb2_length;j++)
        {
          if(sb1.charAt(i+j)==sb2.charAt(j))
          {
            flag++;
          }
        }
        if(flag==sb2.length())
        {
          temp.append(sb3);
          i = i+(sb2.length()-1);
          sb2_length = -1;
        }
        else
        {
          temp.append(sb1.charAt(i));
        }
      }
      System.out.print(temp);
    }
}