package com.lara;
class Animal 
{
    int health = 100;
}

class Mammal extends Animal { }

class Cat extends Mammal { }

class Dog extends Mammal { }
public class Test 
{
	public static void main(String[] args) 
	{
        Cat c = new Cat();
        
        Dog d = new Dog();
        
        Cat c1 = new Cat();
        
        Mammal m = c1;             // upcasting
       
        Mammal m1 = (Mammal)new Cat();
        
        Mammal m2 = new Cat();
        
        Cat c2 = new Cat();              
        Animal a = c2;             //automatic upcasting to Animal
        Cat c3 = (Cat) a; 


        Cat c4 = new Cat();              
        Animal a1 = c4;           //upcasting to Animal
        
        
        if(a1 instanceof Cat)      // testing if the Animal is a Cat
        { 
                System.out.println("It's a Cat! Now i can safely downcast it to a Cat, without a fear of failure.");            
                Cat c5 = (Cat)a;
        } 
       
      //  Mammal m3 = new Mammal();
      //  Cat c5 = (Cat)m3;				//java.lang.ClassCastException
        
        Cat c6 = new Cat();               
        Dog d1 = new Dog();               
        stroke(c6); // automatic upcast to an Animal
        stroke(d1); // automatic upcast to an Animal

        System.out.println("done");

	}  
	
	public static void stroke(Animal a)
	{
        System.out.println("you stroke the " + a.health);
	}




}
