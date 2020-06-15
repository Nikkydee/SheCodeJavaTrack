package Assignments;

public class MethodOverload {

  /*  Method Overloading means  multiple methods can have the same name with different parameters:

    e.g. int printNum(int x)
    float printNum(float x)
    double printNum(double x, double y)
*/


   public static int printNum(int x, int y) {
        return x + y;
    }

    public static double printNum(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int firstnum = printNum ( 8, 5 );
        double secondnum = printNum ( 1.3, 2.8 );
        System.out.println ( "This is my result in  int datatype: " + firstnum );
        System.out.println ( "This is my result in double datatype: " + secondnum );


    }

}
