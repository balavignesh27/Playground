import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<size;i++)
    {
      arr[i] = in.nextInt();
    }
    int max=0;
    for(int i=0;i<size;i++)
    {
      max = (arr[i]>max)?arr[i]:max;
    }
    System.out.print(max);
  }
}