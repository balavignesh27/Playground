import java.util.Scanner;
class Main{
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
      int value = in.nextInt();
      pairs(arr,size,value);
    }
    public static void pairs(int arr[], int size, int value)
    {
       for(int i=0;i<size;i++)
       {
         int output = 0;
         for(int j=i+1;j<size;j++)
         {
           output = arr[i]+arr[j];
           if(output==value)
           {
             System.out.print(arr[i]+", "+arr[j]);
             System.out.println();
             output = 0;
           }
         }
       }
    }
}