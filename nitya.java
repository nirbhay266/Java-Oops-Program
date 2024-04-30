 class c17 {
    public static void main(String args[]) {
        nitya n=new nitya();
        n.nitya1("Niebhay",34);
        System.out.println(n.setnamee());
    }
}
public class nitya
{
    private String name;

    public void nitya1(String name, int age) {
        this.name = name;
    }
    public  String setnamee()
    {
        return name;
    }
}
