import java.util.Scanner;
class noddemo
{
  public static void main(String[] args)
  {
    int m,y;
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter any month(1-12)");
    m = kb.nextInt();
    System.out.println("Enter any year");
    y = kb.nextInt();
    if (m==4||m==6||m==9||m==11)
      System.out.println("NOD 30");
    else if(m==2)
    {
      if(y % 4==0)
       System.out.println("NOD 29");
      else
       System.out.println("NOD 28");
    }
    else
     System.out.println("NOD 31");
  }
}
