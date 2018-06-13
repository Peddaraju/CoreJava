abstract class Q  
{
	Q()  
	{
		System.out.println("Q()");
	}
    abstract void test1();
	abstract void test2();
    void test3()  
	{
		System.out.println("test3");
	}
}
class R extends Q  
{
	R()  
	{
		System.out.println("R()");
	}
	void test1()  
	{
		System.out.println("test1");
	}
	void test2()  
	{
		System.out.println("test2");
	}
}
class S 
{
	public static void main(String[] args) 	
	{
		R r1 = new R();
		System.out.println("-----");
        r1.test1();
		r1.test2();
		r1.test3();
	}
}
