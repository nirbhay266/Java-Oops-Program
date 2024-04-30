interface pac1
{
	void movs();
}
class queen implements pac1
{
	public void movs()
	{
		System.out.println("WE:COME");
	}
}
class king implements pac1
{
	public void movs()
	{
		
		System.out.println("King class");
	}
}
public class pac
{
	public static void main(String args[])
	{
		//queen q=new queen();
		king k=new king();
		k.movs();
	}
}