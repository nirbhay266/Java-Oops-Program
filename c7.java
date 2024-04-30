import javax.swing.plaf.synth.SynthStyle;

public class c7 {
    public static void main(String[] args) {
      
       a a2=new a();
       
        a2.show();
    }
}
class a 
{
    void show()
    {
        System.out.println("Base Class");
    }
}
class b extends a
{
    @Override
    void show()
    {
        System.out.println("Derived class");
    }
}
