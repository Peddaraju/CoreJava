package com.app.sample;

public class SimplePgm
{
	 public static void main(String[] args)
	 {
		  //checking the string is containing valid number or not
          String[] str = new String[]{"10.20", "123456", "12.invalid","12a.12"}; 
          for(int i=0 ; i < str.length ; i ++)
          {
        		if( str[i].indexOf(".") > 0 )
                {
                        try
                        {
                                Double.parseDouble(str[i]);
                                System.out.println(str[i] + " :is a valid decimal number");
                        }
                        catch(NumberFormatException nme)
                        {
                                System.out.println(str[i] + " :is not a valid decimal number");
                        }
                }
                else
                {
                        try
                        {      
                                Integer.parseInt(str[i]);
                                System.out.println(str[i] + " :is valid integer number");
                        }
                        catch(NumberFormatException nme)
                        {
                                System.out.println(str[i] + " :is not a valid integer number");
                        }
                }
        }
	}
}

