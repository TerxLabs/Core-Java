import java.util.Scanner;
class factorial
{
  public static void main(String[] args)
  {
    int n,i,j=1;
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter a no: ");
    n = kb.nextInt();
    for(i=n;i>0;i--)
    {
      j = j * i;
    }
    System.out.println("The factorial is :"+j);
  }
}
