import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      int flag = 0;
      int missing = 0;
      for(int i=0;i<size;i++)
      {
        arr[i] = in.nextInt();
      }
      for(int i=1;i<=size;i++)
      {
        flag = 0;
        for(int j=0;j<size;j++)
        {
          if(i==arr[j])
            flag = 1;
        }
        if(flag==0)
          missing = i;
      }
      System.out.print(missing);
    }
}