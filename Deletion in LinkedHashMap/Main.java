import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashMap<String,String> abc = new LinkedHashMap<String,String>();
      int b = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of values to be inserted in map:"+b);
      for(int i=1;i<=b;i++)
      {
        String key = br.readLine();
        String value = br.readLine();
        abc.put(key,value);
      }
      System.out.println(abc);
      System.out.print("Enter the index to be removed:");
      String b1 = br.readLine();
      abc.remove(b1);
      System.out.println(b1);
      System.out.println(abc);
      System.out.println("Size of map is : "+abc.size());
    }
}