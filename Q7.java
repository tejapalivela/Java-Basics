

interface I
{
    int add(int a, int b);
    int multiply(int a);

}
interface L
{
    int multiply(int a);
}

class Three implements I,L
{
   public int add(int a,int b)
    {
        return a+b;
    }
    public int multiply(int a)
    {
        return a*(a+1)*(a+2);
    }
}
class Four implements L{
    public int multiply(int a)
    {
        //3 consecutive numbers
        return a*(a+1)*(a+2)*(a+3);
    }

}
public class Q7
{
    public static void main(String a[])
    {
        Three obj=new Three();
        Four obj1= new Four();
        System.out.println(obj.multiply(2));
        System.out.println(obj1.multiply(2));

    }
}