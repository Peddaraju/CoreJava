package com.corejava.part1.app9;
public class StaticMemberExample
{       
        public static void main(String[] args) 
        {
            
             ObjectCounter object1 =
            	 			new ObjectCounter();
           
             System.out.println("Object Counting: " 
            		 					+ object1.getNumberOfObjects());
             
             ObjectCounter object2 = 
            	 			new ObjectCounter();
             
             System.out.println("Object Counting: " 
            		 					+ object2.getNumberOfObjects());
             
             ObjectCounter object3 = 
            	 			new ObjectCounter();
             
             System.out.println("Object Counting: " 
            		 					+ object3.getNumberOfObjects());
                               
        }
}
class ObjectCounter
{
	static int counter = 0;
	public ObjectCounter() 
	{
			counter ++;
	}
	public int getNumberOfObjects()
	{
		return counter;
	}
}