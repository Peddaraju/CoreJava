
public class Bicycle 
{
    public int cadence;
    public int gear;
    public int speed;
    public Bicycle(int startCadence, 
    						int startGear,
    						int startSpeed) 
    {
    	cadence = startCadence;
        gear = startGear;
        speed = startSpeed;
    }
    public void setCadence(int newValue) 
    {	
        cadence = newValue;
    }
    public void setGear(int newValue) 
    {
        gear = newValue;
    }
    public void applyBrake(int decrement) 
    {
        speed -= decrement;
    }
    public void speedUp(int increment) 
    {
        speed += increment;
    }
    public void displayMesure()
    {
    	System.out.println(cadence  + ":" + gear + ":" + speed);
    }
    public static void main(String[] args) 
    {
    	Bicycle bicycleObj = new Bicycle(2, 30, 3);
    	bicycleObj.setCadence(5);
    	bicycleObj.setGear(4);
    	bicycleObj.applyBrake(2);
    	bicycleObj.speedUp(20);
    	bicycleObj.displayMesure();
	}
 }
