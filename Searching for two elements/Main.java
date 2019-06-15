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
    int first_ele = in.nextInt();
    int second_ele = in.nextInt();
    int first = -1;
    int second = -1;
    for(int i=0;i<size;i++)
    {
      if(arr[i]==first_ele)
      {
        first = i;
      }
      if(arr[i]==second_ele)
      {
        second = i;
      }
    }
    System.out.println(first);
    System.out.println(second);
  }
}