class K 
{
	static int test(long x) 
	{
		return (int)x;
	}
	public static void main(String[] args) 	
	{
		int i = 10;
		byte b = (byte)test(i);
		System.out.println("done");
	}
}
