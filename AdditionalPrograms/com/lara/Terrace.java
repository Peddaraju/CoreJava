package com.lara;
class Building
{  
    Building()
    {  
        System.out.println("Building");  
    }  
}  
class House extends Building
{  
    private int iBedroomCount;
    
    public int getBedroomCount()
    {  
        return iBedroomCount;  
    }  
    public void setBedroomCount(int iBedRoomCount)
    {  
        this.iBedroomCount = iBedRoomCount;  
    }  
   
}  

class Terrace extends House
{  
    public static void main(String argv[])
    {  
        new Terrace();  
    }  
    
    Terrace()
    {  
        House  b  = (House)new Building();  
    }  
}  
