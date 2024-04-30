class callByValue
{
	public static void main(String args[])
	{

		change1 c=new change1();
		System.out.println(c.data);
		c.change1(c);
				System.out.println(c.data);


		// change c=new change();
		// System.out.println(c.data);
		// c.changedata(500);
		// System.out.println(c.data);

	}
}
class change1
{
	int data=50;
	void changedata(change1 c)
	{
		c.data+=500;
	}
}
// class Operation2{  
//  int data=50;  
  
//  void change(Operation2 op){  
//  op.data=op.data+100;//changes will be in the instance variable  
//  }  
     
    
//  public static void main(String args[]){  
//    Operation2 op=new Operation2();  
  
//    System.out.println("before change "+op.data);  
//    op.change(op);//passing object  
//    System.out.println("after change "+op.data);  
  
//  }  
// }  
// class change
// {
// 	int data=100;
// 	void changedata(int data)
// 	{
// 		data+=200;
// 	}
// }