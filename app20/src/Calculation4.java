public class Calculation4
{
	void sum(int a, int b)
	{
		System.out.println("int arg method invoked");
	}
	void sum(long a, long b)
	{
		System.out.println("long arg method invoked");
	}
	public static void main(String[] args) 
	{
		Calculation4  obj = new Calculation4();
		obj.sum(10, 10);
	}
}

