class Manager4 
{
	public static void main(String[] args) 	
	{
		B b1 = null;
		C c1 = null;
		D d1 = new D();
		E e1 = null;
		F f1 = new F();
		b1 = f1;
		c1 = e1;
		e1 = f1;
		b1 = d1;
		d1 = e1;
		System.out.println("done");
	}
}
