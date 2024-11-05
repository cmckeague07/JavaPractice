public class Variables {
    public static void main(String[] args) {
        System.out.println("Hello world! Variables");

        Variables one = new Variables();
        Variables.displayCount();
    }

    //INSTANCE VARIABLES
    String myinstancevariable = "MY INSTANCE VARIABLE";

    //STATIC VARIABLE
    static int mystaticvariable;

    public Variables(){
        mystaticvariable++;
    }

    public static void displayCount(){
        System.out.println("Instances created " + mystaticvariable);
    }


    public void dataTypes(){
        //INT = Description: Represents a 32-bit signed integer.
        int age = 30;
        //LONG = Description: Represents a 64-bit signed integer, used when larger range than int is
        long population = 7800000000L;
        //DOUBLE = Description: Represents a double-precision 64-bit floating-point number, used for decimal
        double price = 19.99;
        //FLOAT = Description: Represents a single-precision 32-bit floating-point number, also used for decimal values but with less precision than double
        float temperature = 36.6F;
        //CHAR = Description: Represents a single 16-bit Unicode character.
        char grade = 'A';
        //BOOLEAN = Description: Represents one of two values: true or false.
        boolean isActive = true;
        //BYTE = Description: Represents an 8-bit signed integer, useful for saving memory in large arrays.
        byte smallNumber = 100;
        //SHORT = Description: Represents a 16-bit signed integer, smaller than int.
        short temperatureshort = -5;
    }


}


