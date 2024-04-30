public class constructor2 {
    public static void main(String[] args)
    {
        student s1=new student(null);
        s1.name="Student";
        s1.roll=112;
        s1.pasword="dede";
        s1.marks[0]=90;
        s1.marks[1]=80;
        s1.marks[2]=70;
        student s2=new student(s1);
        s2.pasword="deggtgthgt";
        for(int i=0;i<3;i++)
        {
            System.out.println(s2.marks[i]);
        }
    }
}
class student{
    String name;
    int roll;
    String pasword;
    int marks[];
    student(student s1)
    {
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
     //   this.marks=s1.marks;
        for(int i=0;i<3;i++)
        {
            this.marks[i]=s1.marks[i];
        }
    }
    
}
