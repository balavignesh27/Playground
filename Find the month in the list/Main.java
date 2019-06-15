import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      LinkedList<String> month = new LinkedList<String>();
      String b = br.readLine();
      String[] arr = b.split(",");
        for(int i = 0;i<arr.length;i++)
        {
            month.add(arr[i]);
        }
      System.out.println(month);
      String save =br.readLine();
      System.out.println("Size of the linked list: "+month.size());
      System.out.println("Is LinkedList empty? "+month.isEmpty());
      System.out.println("Does LinkedList contains "+save+"?");
      if (month.contains(save))
      {
        System.out.print("true");
      }
      else
      {
        System.out.print("false");
      }
    }
}