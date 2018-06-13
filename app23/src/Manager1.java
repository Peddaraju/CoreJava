class A 
{
	int i;
	void test1()  
	{
		System.out.println("A-test1");
	}
}
class B extends A 
{
	int j;
	void test2() 
	{
	    System.out.println("B-test2");
	}
}
class Manager1 
{
	public static void main(String[] args) 	
	{
		A a1 = new A();
		a1.test1();
		a1.i = 10;
		System.out.println(a1.i);
		B b1 = new B();
		b1.test1();
		b1.i = 10;
		b1.test2();
		b1.j = 20;
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
