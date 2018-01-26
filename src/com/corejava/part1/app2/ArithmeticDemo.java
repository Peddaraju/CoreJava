package com.corejava.part1.app2;
class ArithmeticDemo 
{
     public static void main (String[] args)
     {
    
          int result = 1 + 2; 
          System.out.println(result);
          result -= -1; 
          System.out.println(result);
          result = result * 2; 
        // result *= 2;
          System.out.println(result);
          result = result / 2; 
        // result /= 2;
          System.out.println(result);
          result = result + 8;
        // result += 8;
          result = result % 7; 
        // result %= 7;
          System.out.println(result);
     }
}