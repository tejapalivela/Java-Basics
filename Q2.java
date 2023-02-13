import org.w3c.dom.ls.LSOutput;

class A
{
    public void show()
    {
        System.out.println("class a mehtod");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("class b mehtod");
    }
}
public class Q2
{
    public static void main(String a[]) {
        B obj = new B();
        obj.show();
    }
}
