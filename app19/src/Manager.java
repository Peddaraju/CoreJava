interface G  
{
	void test1();
	int test2();
	void test3(int i);
}
class H implements G  
{
	
	public void test1() 
	{
	    System.out.println("from test1");
	}
	public int test2() 
	{
	    System.out.println("from test2");
		return 10;
	}
	public void test3(int i) 
	{
	    System.out.println("from test3");
	}
}
class Manager  
{
	public static void main(String[] args) 	
	{
		H obj = new H();
		obj.test1();
		obj.test2();
		obj.test3(20);
		System.out.println("done");
	}
}
