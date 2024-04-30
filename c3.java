public class c3
{
    public static void main(String[] args) {
        fox x=new fox();
        x.fl();
        x.walk();
        
    }
}
class animl
{
    
    void walk()
    {
        System.out.println("Animal is walking");
    }
}
class fish extends animl
{
    void swim()
    {
        System.out.println("Animal is swim");
    }
}
class bird extends animl
{
    void fly()
    {
        System.out.println("Animal is ");
    }
}
class fox extends animl
{
    void fl()
    {
        System.out.println("Animal is fly");
    }
}
