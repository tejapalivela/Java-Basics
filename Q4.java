//functionalities of static and final keyword
class Test
{
    final int a=5;
    static int sharedvar;

    public static void show()
    {
        System.out.println("static function of test class");
    }
    static
    {
        sharedvar=10;
    }

}


public class Q4
{
    public static void main(String a[]) {
        //can be called without object
        Test.show();

        Test obj = new Test();
       //results in error if it is reinitialized obj.a=6;
        System.out.println(obj.a);
        Test obj1= new Test();
        Test obj2=new Test();
        System.out.println("this is called from obj1 "+obj1.sharedvar);
        System.out.println("this is called from obj2 "+obj2.sharedvar);


    }

}
