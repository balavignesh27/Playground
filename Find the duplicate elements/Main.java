import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet<String> abc = new TreeSet<String>();
      String m = br.readLine();
      a = m.split(",");
      System.out.println("Duplicate Entry is: "); 
      for (String str : a) 
      {
            if (!abc.add(str)) 
            {
                System.out.println(str);
            }
        }
        System.out.println("TreeSet is : " + abc);
    }
}