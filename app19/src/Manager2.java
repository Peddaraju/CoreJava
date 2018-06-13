interface P 
{
	void test1();
}
interface Q 
{
	void test2();
}
class R 
{
	public void test1()	
	{
		System.out.println("test1");
	}
}
class S extends R implements P, Q  
{
	public void test2()	
	{
		System.out.println("test2");
	}
}
class Manager2 
{
	public static void main(String[] args) 	
	{
		S s1 = new S();
		s1.test1();
		s1.test2();
		System.out.println("done");
	}
}
