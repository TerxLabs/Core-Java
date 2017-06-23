class figure
{
  double dim1, dim2;
  void getfig(double d1, double d2)
  {
    dim1 = d1;
    dim2 = d2;
  }
  double figarea()
  {
    return 0;
  }
}

class rectangle extend figure
{
  void getrect(double l, double b)
  {
    getfig(l,b);
  }
  double rectarea()
  {
    return dim1*dim2;
  }
}

class triangle extends figure
{
    void gettri(double b, double al)
    {
      getfig(b,al);
    }
    double firarea()
    {
      return 0.5*dim1*dim2;
    }
}

class demo
{
  public static void main (String args[])
  {
    figure f = new figure();
    f.getfig(2.0,3.0)
    System.out.println("Area of figure:"+f.figure());
  }
}
