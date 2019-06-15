import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      int left = 0;
      int right = size-1;
      int flag = 0;
      int flag1 = 0;
      for(int i=0;i<size;i++)
      {
        arr[i] = in.nextInt();
      }
      while(left<=right)
      {
        if(arr[left]==arr[right])
          flag = 1;
        else
          flag1 = 1;
        left++;
        right--;
      }
      if(flag==1 && flag1==0)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}