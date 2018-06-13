class A 
{
    void test1()
	{
	    System.out.println("test1:" + this);
		test2();  // this.test2();
	}
    void test2()
	{
	    System.out.println("test2:" + this);
		test3();  // this.test3();
	}
    void test3()
	{
		System.out.println("test3:" + this);
	}
    public static void main(String[] args) 
	{
		A a1 = new A();
	    System.out.println("main:" + a1);
		a1.test1();
	}
}
class B 
{
	int i;
    void test1()
	{
		System.out.println("test1:" + i);
		i = 10;
		test2();
	}
    void test2()
	{
		System.out.println("test2:" + i);
		i = 20;
		test3();
	}
    void test3()
	{
		System.out.println("test3:" + i);
		i = 30;
	}
    public static void main(String[] args) 
	{
		B b1 = new B();
	    System.out.println("main1:" + b1.i);
		b1.i = 5;
		b1.test1();
	    System.out.println("main2:" + b1.i);
	}
}
