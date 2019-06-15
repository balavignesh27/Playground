import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i] = in.nextInt();
      }
      int k = in.nextInt();
      int max;
      for(int i=1;i<=size;i++)
      {
        max = 0;
        for(int j=0;j<size-1;j++)
        {
          if(arr[j]>arr[j+1])
          {
            max = arr[j];            
          }
          else
          {
            max = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = max;
          }
        }
      }   
      System.out.print(arr[k-1]);
      
    }   
}