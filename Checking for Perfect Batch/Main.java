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
    array(arr,n);
  }
  public static void array(int list[],int size)
  {
    int p_value = list[0]+list[1]+list[2];
    int c_value = 0;
    int sum = 0;
    int count = 0;
    int check = 0;
    for(int i=3;i<size;i++)
    {
      sum = sum+list[i];     
      count++;
      if(count==3)
      {
        c_value = sum;
        sum = 0;
        count = 0;
        if(c_value==p_value)
      	{
        p_value = c_value;        
      	}
      else
      	{
        check = 1;
      	}    
      }        
    }
    if(check==0)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
}