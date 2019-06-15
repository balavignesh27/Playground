import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      int parts = in.nextInt();
      str1 = str1.replace(str1,str2);
      String arr[] = str1.split(" ",parts);
      for(String out:arr)
        System.out.println(out);
    }
}