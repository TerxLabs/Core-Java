class bill
{
  public static void main(String[] args)
  {
    double nr, pr, rpu, uc, bill;
    nr = Double.parseDouble(args[0]);
    pr = Double.parseDouble(args[1]);
    rpu = Double.parseDouble(args[2]);
    uc = nr -  pr;
    bill = uc * rpu;
    System.out.println("The value of UC : "+ uc);
    System.out.println("The Total Bill :"+ bill);
  }
}
