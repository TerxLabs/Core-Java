import java.util.Scanner;
class primedemo
{
  public static void main(String[] args)
  {
    int num, i, flag=0;
    Scanner kb = new Scanner (System.in);
    System.out.println("Enter any number :");
    num = kb.nextInt();
    for(i=2;i<=num/2;i++)
    {
      if(num%i==0)
      {
        flag = 1;
        break;
      }
    }
    if (flag==1)
      System.out.println("Not Prime");
    else
      System.out.println("Prime");
  }
}
