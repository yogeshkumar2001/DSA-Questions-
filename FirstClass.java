public class FirstClass {
    // FirstClass class
    String x = " vishal Mandal " ;

    static void StaticFunction() {
        System.out.println("This is vishal Mandal static method");
    }

    public static void PublicFunction() {
        System.out.println("This is vishal Mandal public method");
    }
	
    final int FinalValue = 1000000; //field value


    public static void main(String[] args) {

        StaticFunction(); // call the static method
        FirstClass Obj = new FirstClass(); // creating a object;

        Obj.PublicFunction(); // call the public method 

        System.out.println(Obj.x);

        // we can not change the value of field

        FirstClass fObj = new FirstClass(); 
        System.out.println(fObj.FinalValue); // Access a field value

    }

}
