interface L 
{
	void test1();
}
class M  
{
	void test2()  
	{
		System.out.println("test2");
	}
}
class N extends M implements L  
{
	public void test1() 
	{
		System.out.println("test1");
	}
}
class O  
{
	public static void main(String[] args) 	
	{
		M m1 = new M();
		m1.test2();
		N n1 = new N();
		n1.test1();
		n1.test2();
		System.out.println("done");
	}
}
