 class c17 {
    public static void main(String[] args) {
    System.out.println("Hello");  
    satya s=new satya();
    s.nitya1("Niebhay");             
    System.out.println(s.getname());
    }
} 
 class satya
{
    private String name;
    public void nitya1(String name) {
        this.name=name;
    }  
    public String getname()
    {
        return name;
    } 
}