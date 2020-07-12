package practice;

public class Method {
    /*Note there are three types of methhod
        1.Dumb method 2. Clever Method  3. Smart methhod*/
    //This is a dumb method as it doesthe same thing repeatedly
    public static void addNumber ( ) {

        int a = 5, b = 12;
        int sum = a + b;
        System.out.println ( sum );
    }

    //This is an example of a smart method,asks information or instruction from the boss in the form of input and returns the result to the boss
    public static void addNuumberWithParameters (int a, int b) {
        int sum = a + b;
        System.out.println ( sum );
    }

    //We have the clever method the boss in the form of input and returns the result to the boss
    public static int addNuumberWithParam (int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main (String[] args) {
      //first
        addNumber ( );
        //second
        addNuumberWithParameters ( 9, 12 );
        int x = 2,y = 3;
        int result = addNuumberWithParam ( x, y );
        System.out.println ( result );


    }
}

