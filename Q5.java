

 class X
 {
     public void show()
     {
         System.out.println("this is the method of class x");
     }
 }
 class Y extends X
 {
     public void show1()
     {
         System.out.println("this is the method of class y");
     }
 }
 class Z extends Y
 {
     public void show2()
     {
         System.out.println("this is the method of class Z");
     }
 }

 public class Q5
 {
     public static void main(String a[]) {
         Y obj = new Y();
         //single level--calling function of x using y object
         obj.show();

         Z obj2= new Z();
         //multilevel--calling function of x using z object
         obj2.show();
     }

 }