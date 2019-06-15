import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in  = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int start_idx = 0;
      int end_idx = sb.length()-1;
      reverse_string(sb,start_idx,end_idx);
      for(int i=0;i<sb.length();i++)
      {
        if(sb.charAt(i)==' ')
        {
          reverse_string(sb,start_idx,i-1);
          start_idx = i+1;
        }
        else if(i==sb.length()-1)
        {
          reverse_string(sb,start_idx,i-1);
          start_idx = i+1;
        }
      }
      System.out.print(sb);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      char temp = ' ';
      while(start_idx<end_idx)
      {
        temp = sb.charAt(start_idx);
        sb.setCharAt(start_idx,sb.charAt(end_idx));
        sb.setCharAt(end_idx,temp);
        start_idx++;
        end_idx--;
      }
    }
}