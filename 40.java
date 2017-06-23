interface figure
{
  double half = 0.5;
  double pie = 3.14;
  double area (double x, double y);
}

class rectangle implements figure
{
  public double area(double l, double b)
  {
    return l*b;
  }
}

class triangle implements figure
{
  public double area(double b, double al)
  {
    return half*b*al;
  }
}

class circle implements figure
{
  public double area(double r, double y)
  {
    return pie*r*r;
  }
}

class figdemo
{
  public static void main(String[] args)
  {
    figure figref;
    figref = new rectangle();
    System.out.println("Area of rectangle: " + figref.area(2.0,3.0));
    figref = new circle();
    System.out.println("Area of circle: " + figref.area(10.0,5.0));
    figref = new triangle();
    System.out.println("Area of triangle: " + figref.area(2.0,0.0));
  }
}
