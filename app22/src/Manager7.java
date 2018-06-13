class Manager7 
{
	static B test1(E e1) 
	{
		return test2(e1);
	}
	static C test2(D d1)  
	{
		return d1;
	}
	public static void main(String[] args) 	
	{
		F f1 = new F();
		A a1 = test1(f1);
		System.out.println("done");
	}
}
