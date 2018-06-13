interface I  
{
	void test1();
	void test2();
}
interface J  
{
	void test1();
	void test2();
}
class K implements I, J  
{
	public void test1() 
	{
		System.out.println("test1");
	}
	public void test2() 
	{
		System.out.println("test2");
	}
}
class Manager1 
{
	public static void main(String[] args) 	
	{
		K obj = new K();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}
