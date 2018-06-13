class Manager13 
{
	public static void main(String[] args) 	
	{
		B b1 = new D();
		C c1 = (C) b1;
		D d1 = (D) c1;
		System.out.println("done");
	}
}
