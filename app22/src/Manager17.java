class Manager17 
{
	public static void main(String[] args) 	
	{
		A a1 = new C();
        if(a1 instanceof A) 	
		{
			A a2 = (A) a1;
			System.out.println(1);
		}
		if(a1 instanceof B)	
		{
			B b1 = (B) a1;
			System.out.println(2);
		}
		if(a1 instanceof C)	
		{
			C c1 = (C) a1;
			System.out.println(3);
		}
		if(a1 instanceof D)	
		{
			D d1 = (D) a1;
			System.out.println(4);
		}
		if(a1 instanceof E)	
		{
			E e1 = (E) a1;
			System.out.println(5);
		}
		if(a1 instanceof F)	
		{
			F f1 = (F) a1;
			System.out.println(6);
		}
        System.out.println("done");
	}
}
