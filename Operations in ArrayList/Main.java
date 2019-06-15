import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      LinkedList<String> face = new LinkedList<String>();
      int a1 = Integer.parseInt(br.readLine());
      int arr; 
      String str = br.readLine();
      a = str.split(",");
      for(int i=0;i<a.length;i++)
      {
        face.add(a[i]);
      }
        System.out.println("Choose any one:");
        System.out.println("1.Insert");
        System.out.println("2.delete");
        System.out.println("3.Display");
        System.out.println("4.Exit");
      do
      {
        System.out.println("Choose any one:");
        System.out.println("1.Insert");
        System.out.println("2.delete");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        arr = Integer.parseInt(br.readLine());
        if(arr==1)
        {
          face.add(br.readLine());
        }
        if(arr==2)
        {
          int arr1 = Integer.parseInt(br.readLine());
          System.out.println("Enter the index value to be deleted:"+arr1);
          face.remove(arr1);
        }
        if(arr==3)
        {
          System.out.println(face);
        }
      }while(arr!=4);
}
}