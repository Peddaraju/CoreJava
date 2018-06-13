class P 
{
	int i = 1;
}
class Q extends P
{
	int i = 2;
}
class R extends Q
{
	int i = 3;
}
class Manager1
{
	public static void main(String[] args) 
	{
		P p1 = new P();
		System.out.println(p1.i);
        P p2 = new Q();
		System.out.println(p2.i);
        Q q1 = new Q();
		System.out.println(q1.i);
        R r1 = new R();
		System.out.println(r1.i);
        P p3 = r1;
		System.out.println(p3.i);
        System.out.println(((Q)p3).i);
	}
}
