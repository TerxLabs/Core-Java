class areaofcircle3
{
  public static void main(String[] args)
  {
    double r,ac;
    double pie = 3.14f;
    r = Double.parseDouble(args[0]);
    ac = pie*Math.pow(r,2);
    System.out.println("The area of circle is "+ ac);
  }
}
