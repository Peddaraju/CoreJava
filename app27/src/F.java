class C
{
	int i;
}
class D 
{
	C c1;
    public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println(d1.c1);
	}
}
class E
{
	C c1 = new C();
    public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println(e1.c1);
		System.out.println(e1.c1.i);
	}
}
class F
{
	C c1 = null;
	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.c1 = new C();
		System.out.println(f1.c1);
		System.out.println(f1.c1.i);
	}
}
