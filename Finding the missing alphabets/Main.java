import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int length = str.length();
      int arr[] = new int[26];
      
      for(int i=0;i<26;i++)
      {
        arr[i] = 0;
      }
      
      for(int i=0;i<length;i++)
      {
        if(str.charAt(i)>='a' && str.charAt(i)<='z')
        {
          arr[str.charAt(i)-'a']++;
        }
        else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
          arr[str.charAt(i)-'A']++;
      }
      
      for(int i=0;i<26;i++)
      {
        if(arr[i]==0)
        {
          char ch = (char)(i+'a');
          System.out.print(ch+" ");
        }
      }
     
    }
}