class Manager10 
{
	public static void main(String[] args) 	
	{
		E e1 = new F();
		test((F)e1);
		System.out.println("done");
	}
	static void test(F f1) 
	{
		System.out.println("test(F)");
	}
}
