public class c6 {
    public static void main(String args[])
    {
        a a1=new a();
        a1.add();
        a1.add(67,98);
        a1.add(67,80);
    }
}
class a
{
    void add()
    {
        int a=10;int b=10;
        int c=a+b;
        System.out.println(c);
    }
    void add(int a, int b)
    {
        int c=a+b;
        System.out.println(c);

    }
    void add(int x,float y)
    {
        float c;
        c=x+y;
        System.out.println(c);
    }
}