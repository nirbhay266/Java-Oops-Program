import javax.swing.plaf.synth.SynthStyle;

public class c10 {
    public static void main(String[] args) {
        A r=new A();
        r.show();
        System.out.println(r);
    }
}
class A
{
    int a=20;
    void show()
    {
       
        System.out.println(a);
        System.out.println(this);
    }
}
