abstract class J
{
    int a;
    void display()
    {
        System.out.println("abstract class display function");
    }
}

class K extends J
{
    void display1()
    {
        System.out.println("inheritor of abstract class");
    }
}

public class Q6
{
    public static void main(String a[])
    {
          //on instantiation gives error
          // J obj= new J();
        K obj=new K();
        obj.display();
        obj.display1();
    }
}