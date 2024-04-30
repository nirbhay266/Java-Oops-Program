// class s2
// {
// 	public static void main(String args[])
// 	{
// 		String str="HelloWord";
// 		System.out.println(substr(str,0,5));
// 	}
// }
class nitya
{
	public static String substring(String str,int si,int ei)
	{
		String substr=" ";
		for(int i=si;i<ei;i++)
		{
			substr+=str.CharAt(i);
		}
		return substr;
	}
	public static void main(String args[])
	{
		String str="HelloWord";
		System.out.println(substr(str,0,5));
	}
}