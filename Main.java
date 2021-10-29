public class Main {
    // Main class
    final int fixedValue = 500; // Field A data member of a class. Unless specified otherwise, a field can be
                                // public, static, not static and final.

    int x = 50;

    static void myStatic() {
        System.out.println("from myStatic function    ==>    "+"Static method can be called by without object");
    }

    public static void myPublic() {
        System.out.println("from myPublic function    ==>    "+"Public method must be called by object ");
    }

    public static void main(String[] args) {

        myStatic(); // call the static method wihtout Object

        // myPublic(); // call the public method without object so this woulld compile
        // an error;

        Main myObj = new Main(); // creating a object;

        myObj.myPublic(); // call the public method with object

        System.out.println("Value of x     ==>    "+myObj.x); // access x by object
        myObj.x = 100;
        System.out.println("New Value of x     ==>    "+myObj.x); // we can also change the value of variable x through accessing object;

        // FIELD CONCEPt
        // we can not change the value of field\

        Main finalObj = new Main(); // creating a object to access finalValue of Main class;
        System.out.println("Value of fixedValue data member     ==>    "+finalObj.fixedValue);

        // finalObj.fixedValue=1000; // here we get error because we can't change the value of final int fixedValue;
       

    }

}
