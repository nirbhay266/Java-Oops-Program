class p1
{
	public static void main(String arg[])
	{
		System.out.println("HEllo");
		nitya n=new nitya();
		n.setage(30);
		n.setdata("Nirbhay","nirbhayhf");
		System.out.println("Name is"+n.getdata());
		System.out.println("Email is"+n.getdata2());
		System.out.println("Age is"+n.getage());

	}
}
class nitya
{
	private String name;
	private int age;
	private String email;
	public void setage(int age)
	{
		this.age=age;
	}
	public int getage()
	{
		return age;
	}
	public void setdata(String name,String email)
	{
		this.name=name;
		//this.age=age;
		this.email=email;
	}
	public String getdata()
	{
		return name;
	}
	
	public String getdata2()
	{
		return email;
	}
}