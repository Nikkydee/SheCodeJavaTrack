package practice;

public class MethodOverloading {
    /*  Method overloading is a method within the same class tht has same name and different characteristic like different tyupe of parameter. Overload method are different types
    * of parameters that perform the same operation
    * xtis of method overloading
    * 1. The method definition must have  somrthing differnet parameter list
    * 2. Two or more method having the same name in the same class, then you are overlaoding the method name
    * 3. Java distinguishes the overload method by the number of parmeters and parameter type
    * In java code compiler checks If the argument has same parameter type with the second . If none is the case then java ues casting to covert smaller to bigger type sucha as converting int to double and checking if there is a valid match
    * Access modifies cant be use to verload methods
    * Ambiquous overloading
    *
    * public int max(intx, double y)
    * public  int max(double x, int y)
    *
    * if you  call this method a max(3,0.5) it picks the first method and run
    * if you call this method max(0.5,3) it executes the second method
    * Therefore calling Max(3,5) this leads tp ambiguous invocation/ overlaoding this is because the compiler is uncertain on which
    * metod to be called so to resolve this another method with integer parameters has to be cerated i.e
    * public  int max(int x, int y)
    * */

    public static int min(int a, int b){
        int min;
        if (a < b) {
            min =a;
        }
        else{
            min = b;
        }
        return min;
    }

    public static double min(double a, double b){
        double min;
        if (a < b) {
            min =a;
        }
        else{
            min = b;
        }
        System.out.println ( ("Double version called") );
        return min;
    }

    public static void main (String[] args) {

       //int result = min(3,2);
        //double result = min(3.0,2.0);
        double result = min(3,5);
        System.out.println(result);

    }
}


