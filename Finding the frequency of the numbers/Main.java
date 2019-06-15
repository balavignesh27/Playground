import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i] = in.nextInt();
      }
      int free[] = new int[k];
      for(int j=0;j<k;j++)
      {
        free[j] = 0;
      }
      for(int i=0;i<n;i++)
      {
        free[arr[i]-1]++;
      }
      for(int i=0;i<k;i++)
      {
        System.out.print((i+1)+" "+free[i]+"\n");
      }
    }
}