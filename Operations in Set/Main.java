import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet<String> num = new LinkedHashSet<String>();
      String str = br.readLine();
      a = str.split(",");
      for(int i=0;i<a.length;i++)
      {
         num.add(a[i]);
      }
      System.out.println(num);
      String b = br.readLine();
      System.out.println("Enter the value to be deleted: "+b);
      num.remove(b);
      System.out.println(num);
      String c = br.readLine();
      System.out.println("Enter the value to be added: "+c);
      num.add(c);
      System.out.println(num);
    }
}