abstract class G  
{
	void test1()  
	{
		System.out.println("test1");
	}

    abstract void test2();

    void test3()  
	{
		System.out.println("test3");
	}

    abstract void test4();
}
class H extends G  
{
	void test2()  
	{
		System.out.println("test2");
	}
	void test4()  
	{
		System.out.println("test4");
	}
}
class I 
{
	public static void main(String[] args) 	
	{
		H obj = new H();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		System.out.println("done");
	}
}
