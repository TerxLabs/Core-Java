class alpha
{
  void display()
  {
    System.out.println("display of alpha ex");
  }
}
class beta extends alpha
{
  void display()
  {
    System.out.println("display of beta ex");
  }
}
class demo
{
  public static void main (String args[])
  {
    alpha aref;
    alpha aa = new alpha();
    beta bb =new beta();
    aref = aa;
    aref.display();
    aref = bb;
    aref.display();
  }
}
