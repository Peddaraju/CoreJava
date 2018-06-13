package com.lara;
class Car
{
    int price;
    String name;
    String color;
        
    void move()
    {
    	System.out.println("Basic Car move");
    }
      
}

class Ford extends Car
{
	  void move()
	  {
	    System.out.println("Moving with V engine");
	  }
}

class Honda extends Car
{
	  void move()
	  {
	    System.out.println("Move with i-VTEC engine");
	  }
	}
class PolymorphismExample 
{
	public static void main(String[] args) 
	{
	    Car car = new Car();
	    Car f = new Ford();
	    Car h = new Honda();
	    
	    car.move();
	    f.move();
	    h.move();
	    
	  }
}
