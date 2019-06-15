//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int amount)
  {
    //write your Faculty class statements
    int salary = amount;
    System.out.println("Base Salary: "+salary);
  }
}
class CSE
{
  public void salary(int amount)
  {
    //write your CSE class statements
    int salary = amount+3000;
    System.out.println("CSE Faculty: "+salary);
  }
}
class IT
{
  public void salary(int amount)
  {
    //write your IT class statements
    int salary = amount+5000;
    System.out.println("IT Faculty: "+salary);
  }
}
class ECE
{
  public void salary(int amount)
  {
    //write your ECE class statements
    int salary = amount+4500;
    System.out.println("ECE Faculty: "+salary);
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int amount = in.nextInt();
    Faculty fc = new Faculty();
    fc.salary(amount);
    CSE cs = new CSE();
    cs.salary(amount);
    IT it = new IT();
    it.salary(amount);
    ECE obj = new ECE();
    obj.salary(amount);
    //implement your required concept here
  }
}