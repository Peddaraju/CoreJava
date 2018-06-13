abstract class J 
{
	abstract void test1();
	abstract int test2();
	abstract int test3(double d);
    void test4()  
	{
		System.out.println("test4");
	}
}
abstract class K extends J  
{
	void test1()  
	{
		System.out.println("test1");
	}
}
class L extends K  
{
	int test2()  
	{
		System.out.println("test2");
		return 10;
	}
	int test3(double d) 
	{
		System.out.println("test3");
		return 20;
	}
}
class M 
{
	public static void main(String[] args) 	
	{
		L obj = new L();
		obj.test1();
		obj.test2();
		obj.test3(2.3);
		obj.test4();
		System.out.println("done");
	}
}
