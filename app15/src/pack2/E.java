package pack2;
class D 
{
	static int i = 20;
}
class E 
{
	public static void main(String[] args) 	
	{
	   System.out.println(D.i);
	   System.out.println(pack1.D.i);
	}
}
