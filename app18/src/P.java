abstract class N 
{
	void test1()  
	{
		System.out.println("test1");
	}
}
class O extends N 
{
}
class P 
{
	public static void main(String[] args) 	
	{
		//N n1 = new N();
		//n1.test1();
		O o1 = new O();
		o1.test1();
		System.out.println("done");
	}
}
