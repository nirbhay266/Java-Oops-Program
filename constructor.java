class constructor
{
    public static void main(String[] args) {
        student s1= new student();
        s1.roll=1;
        s1.name="abc";
        s1.pasword="ddd";
        s1.marks=new int[3];
        s1.marks[0]=10;
        s1.marks[1]=20;
        s1.marks[2]=30;
         System.out.println(s1.roll);
         System.out.println(s1.name);
        // System.out.println(s1.marks[0]);
        // System.out.println(s1.marks[1]);
        // System.out.println(s1.marks[2]);
        student s2=new student(s1);
        s1.marks[2] = 99;
        for(int i=0;i<3;i++)
        {
            System.out.println(s1.marks[i]);
        }
        
    }
}
class student
{
    int roll;
    String pasword;
    String name;
    int marks[];
    student(student s1)
    {
        this.roll=s1.roll;
        this.name=s1.name;
        this.marks=s1.marks;
    }
    student()
    {
        marks=new int[3];
        System.out.println("Constructor is called");
    }
}