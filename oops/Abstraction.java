abstract class Animal{
   abstract void walks();
   void eat(){
        System.out.println("eating....");
   }
   Animal(){
    System.out.println("You are creating Animal object");
   }
}

class Horse extends Animal{
    void walks(){
        System.out.println("horse walk");
    }

    Horse(){
        System.out.println("You are creating horse object");
    }
}
class Chicken extends Animal{
    void walks(){
        System.out.println("Chicken walk");
    }

    Chicken(){
        System.out.println("You are creating Chicken object");
    }
}



public class Abstraction {
    public static void main(String args[]){
            // Horse h1 =  new Horse();
            // h1.walks();
            // h1.eat();

            Animal a1 = new Chicken();
            a1.walks();
    }
}
