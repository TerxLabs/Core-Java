import java.util.Scanner;
class sum2num
{
  public static void main(String[] args)
  {
    int a, b, c;
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter first no :");
    a = kb.nextInt();
    System.out.print("Enter Second no :");
    b = kb.nextInt();
    c = a + b;
    System.out.print("The sum of 2 numbers is "+ c);
  }
}
