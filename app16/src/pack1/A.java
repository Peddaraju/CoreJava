package pack1;
class A  
{
	private static int i;

	private static void test1() 
	{
	    System.out.println("from test1:" + i);
	}	

	static void test2() 
	{
	    System.out.println("from test2:" + i);
	}

	public static void main(String[] args) 	
	{
	    System.out.println("from A.main:" + i);
	    test1();
	    test2();
	}
}
