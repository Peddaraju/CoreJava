package pack1;
class I 
{
	private static I obj;

    private I() 
	{
	    System.out.println("obj created");
	}
    
	static	
	{
		obj = new I();
	}
    
	public static I getObject()	
	{
		System.out.println(obj.toString()+":"+obj.hashCode());
		return obj;
	}
}
class Manager  
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 	
	{
		//I i1 = new I();
		I i2 = I.getObject();
		I i3 = I.getObject();
		I i4 = I.getObject();
		I i5 = I.getObject();
		I i6 = I.getObject();
		I i7 = I.getObject();
		I i8 = I.getObject();
		I i9 = I.getObject();
		I i10 = I.getObject();
        System.out.println("done");
	}
}
