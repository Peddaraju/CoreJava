class C  
{
	static void test1() 
	{
	    System.out.println("C-test1");
	}
}
class D extends C 
{
	static void test1() 
	{
	    System.out.println("D-test1");
	}
}
class Manager42  
{
	static void method(C c1) 
	{
		c1.test1();
	}
	public static void main(String[] args) 	
	{
		C obj1 = new C();
		D obj2 = new D();
		method(obj1);
		method(obj2);
	}
}
