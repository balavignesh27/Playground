import java.util.*;
import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
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
      System.out.print(num);
    }
}