import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeMap<String,String> abc = new TreeMap<String,String>();
      int b = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of values to be inserted in map:"+b);
      for(int i=1;i<=b;i++)
      {
        String key = br.readLine();
        String value = br.readLine();
        abc.put(key,value);
      }
        System.out.println(abc);      
        String a1 = br.readLine();
        System.out.println("Enter the index to be removed:"+a1);
        abc.remove(a1);
        System.out.println(abc);
        String name1 = br.readLine();
        System.out.println("Enter the index to insert:"+name1);
        String m1 = br.readLine();
        System.out.println("Enter the value to be inserted:"+m1);
        abc.put(name1,m1);
        System.out.println(abc);
    } 
}