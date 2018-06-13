package pack1;
class Animal
{
	   void move()
	   {
	      System.out.println("Animals can move");
	   }
}

class Dog extends Animal
{

   void move()
   {
      System.out.println("Dogs can walk and run");
   }
   void bark()
   {
      System.out.println("Dogs can bark");
   }
}

 class TestDog
{

   public static void main(String args[])
   {
      Animal a = new Animal(); // Animal reference and object
      Animal b = new Dog(); // Animal reference but Dog object

      a.move();// runs the method in Animal class
      b.move();//Runs the method in Dog class
      //b.bark();
   }
}