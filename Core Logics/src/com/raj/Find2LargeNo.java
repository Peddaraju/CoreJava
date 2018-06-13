package com.raj;

public class Find2LargeNo {
	public static void main(String[] args) {
		
		int a[]={4,2,6,18,8,2,1,10};
		int l1=a[0];
		int l2=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(l1>a[i] && l2>a[i])
			{
				continue;
			}
			else if (l1<l2) {
				l1=l2;
			}
				l2=a[i];
		}
		System.out.println(l1);
		System.out.println(l2);
		
	}
	
	
	

}
