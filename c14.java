public class c14
{
    public static void main(String[] args)
    {
        Demo1 d=new Demo1();
        double r;
        d.test();
        d.test(10);
        r = d.test(55.5);
        System.out.println(r);
    }
}
class Demo1  

{
    void test()
    {
        System.out.println("No Paramiter is defined");
    }
    void test(int a)
    {
        System.out.println("Value is " + a);
    }
    double test(double a)
    {
        System.out.println("Value is " +a);
        return a*a;
    }
}
