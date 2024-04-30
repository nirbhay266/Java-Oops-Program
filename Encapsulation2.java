public class Encapsulation2 {
    public static void main(String[] args) {
        System.out.println("Nirbhay");    
       student s1 = new student();
        s1.setCollege("NIT");
        s1.setName("nirbhay");
        s1.setEmail("nirbhaykkr6@gmail.com");
        s1.setphone(987654321);
        System.out.println(s1.getCollege()+" "+s1.getName()+" "+s1.getEmail()+" "+s1.getphone());
    }
}
class student{
    private String college;
    private String name;
    private String Email;
    private int phone;
    public String getCollege()
    {
        return college;
    }
    public void setCollege(String college)
    {
        this.college=college;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getEmail()
    {
        return Email;
    }
    public void setEmail(String Email)
    {
        this.Email=Email;
    }
    public int getphone()
    {
        return phone;
    }
    public void setphone(int phone)
    {
        this.phone=phone;
    }
}