class A 
{
	int i;
	static int j;

    public static void main(String[] args) 
	{
		System.out.println(j);
		System.out.println(A.j);
        A a1 = new A();
		System.out.println(a1.i);
		System.out.println(a1.j);
	}
}
