public class c5
{
    public static void main(String[] args)
    {
        Pen p1=new Pen();
        p1.setColor("blue");
       System.out.println(p1.getColor());
       p1.setTip(5);
       System.out.println(p1.getTip());
        p1.setColor("green");
        System.out.println(p1.getColor());
    }
}
class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    void setColor(String Color) {
        this.color = Color;
    }

    int getTip() {
        return this.tip;
    }

    void setTip(int Tip) {
        this.tip = Tip;
    }

}

