
class Calci
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int add(int a, int b,int c)
    {
        return a+b+c;
    }

}


public class Q1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calci obj=new Calci();
        int result1=obj.add(2,3);
        System.out.println("result1 is"+ result1);
        int result2=obj.add(2,3,4);
        System.out.println("result2 is "+ result2);
    }
}