public class c9 {
    public static void main(String[] args) {
       B r=new B();
       r.test(); 
    }
}
class A
{
    void test()
    {
        System.out.println("A");
    }
}
class B extends A
{

    void test()
    {
        super.test();
        System.out.println("B");
    }
}
