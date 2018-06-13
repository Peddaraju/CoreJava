class H 
{
	void test1() 
	{
		System.out.println("test1()");
	}
    void test2() 
    {
		System.out.println("test2()");
    }
}
class I extends H 
{
	void test2() 
	{
	    System.out.println("modified test2()");
	}
	public static void main(String[] args) 	
	{
		I obj = new I();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}
