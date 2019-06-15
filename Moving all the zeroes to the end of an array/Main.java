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
      rotate(arr,size);
      for(int i=0;i<size;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
  public static void rotate(int arr[],int size)
  {
    int count = 0;
    for(int index=0;index<size;index++)
    {
      if(arr[index]!=0)
      {
        int temp = arr[index];
        arr[index] = arr[count];
        arr[count] = temp;
        count++;
      }
    }
  }
}