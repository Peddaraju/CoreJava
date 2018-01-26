package com.corejava.part1.app10;
class G 
{
	G() 
	{
		System.out.println("G()");
	}
	G(int i)	
	{
		System.out.println("G(int)");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) 	
	{
		G g1 = new G();
		System.out.println("----");
		G g2 = new G(20);
		System.out.println("----");
		G g3 = new G();
		System.out.println("----");
	}

}
