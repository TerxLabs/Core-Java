import school.student;
import school.sports;

class result extends student implements sports
{
  double mst1, mst2, total;
  void getmarks(double m1,double m2)
  {
    mst1 = m1;
    mst2 = m2;
  }
  void putmarks()
  {
    System.out.println("Marks are: " +(mst1 + mst2));

  }
  public void putsports()
  {
    System.out.println("Sports name: "+spname);
    System.out.println("Sports weitage: "+sport);
  }
  void display()
  {
    putdata();
    putmarks();
    putsports();
    System.out.println("Total Score: "+ (total = mst1 + mst2 + sport));
  }
}
class demo
{
  public static void main(String[] args)
  {
    result r = new result();
    r.getdata(1001,"Ram");
    r. getmarks(85.0,90.0);
    r.display();
  }
}
