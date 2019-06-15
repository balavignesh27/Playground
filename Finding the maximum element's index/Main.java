import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = in.nextInt();
    }
    int output = maximum(arr,n);
    System.out.print(output);
  }
  public static int maximum(int list[],int size)
  {
    int max = Integer.MIN_VALUE;
    int integer = 0;
    for(int i=0;i<size;i++)
    {
      if(list[i]>max)
      {
        max = list[i];
        integer = i;
      }
    }
    return integer;
  }
}