public class c13 {
    public static void main(String[] args) {
        Animal a = new fish();
        Animal v = new bird();
        a.eat();
        a.walk();
        v.eat();
        v.walk();
            }
}
interface Animal
{
    void eat();
    void walk();
}
interface yadav
{
    void milk();
}
interface cow
{
    void legs();
}
class fish implements Animal,yadav
{
    public void eat()
    {
        System.out.println("Fish is eating");
    }
    public void milk()
    {
        System.out.println("MILK IS VERY ENRGETIC ");
    }
    public void walk()
    {
        System.out.println("Fish is walking");
    }
}
class bird implements Animal, cow
{
    @Override
    public void eat()
    {
        System.out.println("Bird is eating");
    }
    @Override
    public void walk()
    {
        System.out.println("Bird is walking");
    }
    public void lags()
    {
        System.out.println("Cow is four lags");
    }

    @Override
    public void legs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}