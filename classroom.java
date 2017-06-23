import java.util.Scanner;

class classdemo
{
  int l, b, h;
  void getdata()
  {
    Scanner S = new Scanner(System.in);
    System.out.print("Enter value of L: ");
    l = S.nextInt();
    System.out.print("Enter value of B: ");
    b = S.nextInt();
    System.out.print("Enter value of H: ");
    h = S.nextInt();
  }
  void volume()
  {
    System.out.print("The volume: "+ (l*b*h));
  }
}

class classroom
{
  public static void main(String[] args)
  {
    classdemo c = new classdemo();
    c.getdata();
    c.volume();
  }
}
