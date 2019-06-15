import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      StringBuilder str = new StringBuilder(s);
      int length = str.length();
      int arr[] = new int[26];
      
      for(int i=0;i<26;i++)
      {
        arr[i] = 0;
      }
      
      for(int i=0;i<length;i++)
      {
        if(str.charAt(i)>='A' && str.charAt(i)<='Z')
        {
          int offset = str.charAt(i)-'A';
          char ch = (char)(offset+'a');
          str.setCharAt(i,ch);
          arr[offset] = arr[offset]+1;
        }
        else if(str.charAt(i)>='a' && str.charAt(i)<='z')
        {
           int offset = str.charAt(i)-'a';
           arr[offset] = arr[offset]+1;          
        }
      }
      for(int i=0;i<length;i++)
      {
        if(arr[str.charAt(i)-'a']!=0)
        {
          System.out.print(str.charAt(i)+""+arr[str.charAt(i)-'a']+" ");
          arr[str.charAt(i)-'a'] = 0;
        }
      }
      
    }
}