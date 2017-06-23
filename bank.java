import java.util.Scanner;

class details
{
  Scanner S = new Scanner(System.in);

  int accno;
  String name;
  double balance;
  void getdata()
  {
    System.out.print("Enter Account no: ");
    accno = S.nextInt();
    System.out.print("Enter Name: ");
    name = S.next();
    System.out.print("Enter Balance: ");
    balance = S.nextDouble();
  }
  void deposit()
  {
    double d;
    System.out.print("Enter the value to deposite in main balance: ");
    d = S.nextDouble();
    balance = balance + d;
  }
  void withdraw()
  {
    double w;
    System.out.print("Enter the value to withdraw: ");
    w = S.nextDouble();
    balance = balance - w;
  }
  void display()
  {
    System.out.print("The main balance: "+ balance);
  }
}

class bank
{
  public static void main(String[] args)
  {
    Scanner S = new Scanner(System.in);
    System.out.println("********************** APKA BANK *************************");
    System.out.println("Enter the following details:-");
    details det = new details();
    det.getdata();
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Display");
    System.out.print("Enter the your choice: ");
    int ch;
    ch = S.nextInt();
    if(ch == 1)
    {
      det.deposit();
    }
    else if (ch == 2)
    {
      det.withdraw();
    }
    else
      System.out.println("Invalid Key");
  }

}
