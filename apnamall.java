import java.util.Scanner;

class item
{
  Scanner kb = new Scanner(System.in);
  String code, name, rate, qty, dis, tax;
  double value, irate, iqty;
  int icode;
  double taxvalue;    double disvalue;    double amount;



  void basic()                          //for basic input
  {
    System.out.print("\n\nEnter Item Code: ");
    code = kb.next();
    icode = Integer.parseInt(code);

    System.out.print("\nEnter Item Name: ");
    name = kb.next();

    System.out.print("\nEnter Item Rate: ");
    rate = kb.next();
    irate = Double.parseDouble(rate);

    System.out.print("\nEnter Item Quantity: ");
    qty = kb.next();
    iqty = Double.parseDouble(qty);
  }

  void value()                          //for calculating value
  {
    value = irate * iqty;
    System.out.print("\nItem Value: "+ value);
  }

  void tax()                            //for calculating tax value
  {
    System.out.print("\n\nEnter Tax(%): ");
    tax = kb.next();
    double itax = Double.parseDouble(tax);
    taxvalue = value * (itax/100);
  }

  void discount()                       //for calculating discount value
  {
    System.out.print("\nEnter Discount(%): ");
    dis = kb.next();
    double idis = Double.parseDouble(dis);
    disvalue = value * (idis/100);
  }

  void amount()
  {
    amount = value + taxvalue - disvalue;
    System.out.print("\nItem Value: "+ amount+"\n");
  }

}

class apnamall
{
  public static void main(String[] args)
  {
    item i = new item();
    i.basic();
    i.value();
    i.tax();
    i.discount();
    i.amount();
  }
}
