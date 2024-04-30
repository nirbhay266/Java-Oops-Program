public class c8 {
    public static void main (String args[])
    {
        Bird bid=new Bird();
        bid.eat();
        bid.fly();
        bid.breath();
        
    }
}
class Animal
{
    String color;
    void eat()
    {
        System.out.println("This is Animal Class");
    }
    void breath()
    {
        System.out.println("Breath");
    }
}
class mamle extends Animal
{
    void walk()
    {
        System.out.println("Walk class");
    }
}
class fish extends Animal
{
    void swim()
    {
    System.out.println("This Fish Class Extend by Animal");
    }
}
class Bird extends Animal
{
    void fly()
    {
        System.out.println("This is bird class");
    }
}
