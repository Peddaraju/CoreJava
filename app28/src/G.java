class G 
{
	int i;
	G obj;
    public static void main(String[] args) 
	{
		G g1 = new G();
        System.out.println(g1.i);
		System.out.println(g1.obj);
        g1.obj = new G();
		g1.obj.i = 10;
		g1.i = 20;
        System.out.println(g1.i);
		System.out.println(g1.obj.i);
	}
} 
