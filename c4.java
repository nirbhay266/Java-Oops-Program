public class c4 {
    public static void main(String[] args) {
        A r=new A();
        System.out.println(r);
        r.show();
    }
}
class A
{
   void show()
   {
    System.out.println(this);
   }
}
