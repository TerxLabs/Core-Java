package school;

public class student
{
  int rollno;
  String name;
  public void getdata(int r, String n)
  {
    rollno = r;
    name = n;
  }
  public void putdata()
  {
    System.out.println("Rollno: "+ rollno);
    System.out.println("Name: "+ name);
  }
}
