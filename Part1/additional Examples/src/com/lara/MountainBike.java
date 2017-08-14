package com.lara;
public class MountainBike extends Bicycle 
{
    public int seatHeight;
    public MountainBike(int startHeight, 
						int startCadence,
                        int startSpeed, 
						int startGear) 
    {
        super(startCadence, 
				startSpeed, 
				startGear);
        seatHeight = startHeight;
    }   
    public void setHeight(int newValue) 
    {
        seatHeight = newValue;
    }  
    public void getHeight()
    {
    	System.out.println("seatHeight is:" + seatHeight);
    }
    public static void main(String[] args) 
    {
    	MountainBike mountainBike = 
				new MountainBike(1500, 2, 30, 2);
    	mountainBike.setHeight(3000);
    	mountainBike.setCadence(4);
    	mountainBike.speedUp(20);
    	mountainBike.setGear(4);
    	mountainBike.applyBrake(2);
    	mountainBike.setHeight(3000);
    	mountainBike.displayMesure();
    	mountainBike.getHeight();
	}
}
