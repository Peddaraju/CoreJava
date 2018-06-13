interface T  
{
	void test1();
}
interface U  
{
	void test2();
}

interface V extends T, U  
{
	void test3();
}
class W implements V  
{
	public void test1()	
	{
		System.out.println("test1");
	}
	public void test2()	
	{
		System.out.println("test2");
	}
	public void test3()	
	{
		System.out.println("test3");
	}
}
class Manager3 
{
	public static void main(String[] args) 	
	{
		W obj = new W();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("done");
	}
}
