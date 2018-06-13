class Manager2 
{
	public static void main(String[] args) 	
	{
		A a1 = new A();
		A a2 = a1;
        B b1 = new B();
		B b2 = b1;
        C c1 = null;
		C c2 = c1;
        D d1, d2;
		d1 = d2 = new D();
        E e1, e2 = new E();
		e1 = e2;
        F f1, f2 = null;
		f1 = f2;
		System.out.println("done");
	}
}
