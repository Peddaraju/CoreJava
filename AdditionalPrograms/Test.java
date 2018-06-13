import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class A
{
	int empNo;
	String empName;
	A(int empNo, String empName)
	{
		this.empNo = empNo;
		this.empName = empName;
	}
	@Override
	public String toString()
	{
		return Integer.toString(empNo)+"="+empName;
	}
	@Override
	public int hashCode()
	{
		return Integer.toString(empNo).hashCode()+empName.hashCode();
	}
	
	public boolean equals(Object obj)
	{
		
		try {
			return (obj instanceof A && empNo == ((A)obj).empNo && empName == ((A)obj).empName); 
		} catch (ClassCastException e) {
			e.printStackTrace();
			return false;
		}
		catch(NullPointerException npe) {
			return false;
		}
		
	}
	
}
public  class Test {
	public static void main(String[] args) {
	
		A a1 = new A(1,"raju");
		A a2 = new A(2,"adi");
		A a3 = new A(3,"reddy");
		A a4 = new A(3,"reddy");
		A a5 = new A(2,"adi");
		Set<A> l=new HashSet<A>();
		l.add(a1);
		l.add(a2);
		l.add(a3);
		l.add(a4);
		l.add(a5);
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a5));
		System.out.println(a3.equals(a4));
		System.out.println(a1.equals(null));
		System.out.println(a1.equals(l));
		
		System.out.println(l);
	}

	
	
}
