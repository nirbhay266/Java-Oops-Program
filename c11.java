public class c11 {
    public static void main(String[] args) {
        fish r=new fish();
        r.swim();
       r.walk();
    }
}
class Animal
{
    String color;
    int lages;
    void walk()
    {
        System.out.println("Animal is walking");
    }

    public void milk() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
class hourse extends Animal
{
   
    void walk()
    {
        //super.walk();
        System.out.println("hourse is walking");
    }
}
class fish extends hourse{
    void swim()
    {
        super.walk();
        System.out.println("fish is swimming");
    }
}
