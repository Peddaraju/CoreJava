class A1
{
	static void test()
	{
		System.out.println("A-test");
	}
}
class B1 extends A1
{
	static void test()
	{
		System.out.println("B-test");
	}
}
class Manager41 
{
	public static void main(String[] args) 
	{
		A1 a1 = new A1();
		A1 a2 = new B1();
		B1 b1 = new B1();

		A1[] x = new A1[3];
		x[0] = a1;
		x[1] = a2;
		x[2] = b1;
		
		for(int i = 0; i < x.length; i++)
		{
			x[i].test();
		}
	}
}
