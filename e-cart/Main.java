//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void setPrice(int amount)
  {
    this.price = amount;
  }
  public int getPrice()
  {
    return this.price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setProduct(String name, int qua)
  {
    this.product = name;
    this.quantity = qua;
  }
  public int getProduct()
  {
    return this.quantity;
  }
}

class Bill
{
  //implement your logic to calculate total price
  public void total(int item, int quantity)
  {
    int total = item*quantity;
    System.out.println("Total Price is : "+total);
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String it = in.nextLine();
    int pr = in.nextInt();
    int qu = in.nextInt();
    Item i = new Item();
    i.setPrice(pr);
    int item = i.getPrice();
    
    Customer c = new Customer();
    c.setProduct(it, qu);
    int quantity = c.getProduct();
    
    Bill obj = new Bill();
    obj.total(item, quantity);
    //write the logic here
  }
}