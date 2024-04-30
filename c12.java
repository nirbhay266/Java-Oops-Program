public class c12 {
    public static void main(String[] args) {
        fish1 f=new fish1();
        f.eat();
        f.fly();
        f.walk();
    }
}
abstract class Animal1
{
    void eat()
    {
        System.out.println("This is Animal Class");
    }
    abstract void walk();
}
class hourse1 extends Animal
{
    void walk()
    {
        System.out.println("This is hourse class");
    }
    void grash()
    {
        System.out.println("This is grash Method");
    }
}
class fish1 extends Animal
{
    void walk()
    {
        System.out.println("This is fish class");
    }
    void fly()
    {
        System.out.println("This is fish Method in fish class");
    }
}
          
