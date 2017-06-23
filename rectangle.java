class rectangle
{
  int l, b;
  void getdata(int l , int b)
  {
    this.l = l;
    this.b = b;
  }
  void area()
  {
    System.out.println("Area: "+(l*b));
  }
  rectangle greater (rectangle r)
  {
    if (r.area > area)
      return r;
    else
      return this;
  }
}

class demo
{
  public static void main(String[] args)
  {
    rectangle a = new rectangle();
    rectangle b = new rectangle();
    rectangle c;
    a.getdata(2,3);
    b.getdata(4,5);
    c = a.greater(b);
    c.display();
  }
}
