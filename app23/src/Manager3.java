class Manager3 
{
	public static void main(String[] args) 	
	{
		A a1 = new B();
		a1.i = 10;
		a1.test1();
		B b1 = (B) a1;
		b1.j = 20;
		b1.test2();
		b1.i = 30;
		b1.test1();
		System.out.println("done");
	}
}
