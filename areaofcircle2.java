import static java.lang.Math.pow;
class areaofcircle2
{
  public static void main(String[] args)
   {
    double r,ac;
    r = Double.parseDouble(args[0]);
    ac = 3.14*Math.pow(r,2);
    System.out.println("The area of circle is :"+ ac);
  }
}
