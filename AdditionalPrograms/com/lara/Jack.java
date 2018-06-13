package com.lara;
class Jack 
{
	int i;
	Jack obj;
	public static void main(String[] args) 
	{
		Jack j1 = new Jack();
		j1.i = 10;
		j1.obj = new Jack();
		j1.obj.i = 20;
		j1.obj.obj = new Jack();
		j1.obj.obj.i = 30;
		System.out.println(j1.i);
		System.out.println(j1.obj.i);
		System.out.println(j1.obj.obj.i);
		System.out.println(j1.obj.obj.obj);
	}
}
