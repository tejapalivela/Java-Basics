class Myclass
{
    private int A,B;
    private int integer;
    private float floater;
    private char character;
    private boolean bool;
    private String mystring;
    public Myclass()
    {
        System.out.println("default constructor of myclass");
    }
    public Myclass(int a,int b)
    {
        A=a;
        B=b;
        System.out.println("intialized with "+A +B);
    }
    public void setter(int a,float b, char c,boolean d, String s)
    {
        integer=a;
        floater=b;
        character=c;
        bool=d;
        mystring=s;
    }
    public int getint()
    {
        return integer;
    }
    public float getfloat()
    {
        return floater;
    }
    public char getchar()
    {
        return character;
    }
    public boolean getbool() {
        return bool;
    }

    public String getstring()
    {
        return mystring;
    }

}

public class Q3
{
    public static void main(String a[])
    {
        Myclass obj= new Myclass();
        Myclass obj2=new Myclass(2,3);
        Myclass obj3=new Myclass();
        obj3.setter(3,4.5f,'a',true,"okay");
        System.out.println(obj3.getint());
        System.out.println(obj3.getfloat());
        System.out.println(obj3.getbool());
        System.out.println(obj3.getchar());
        System.out.println(obj3.getstring());

    }

}