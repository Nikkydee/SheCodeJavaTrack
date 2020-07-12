package practice;

public class SmartMethod {

    public static void main (String[] args) {
        int result = add(5,6);
        System.out.println(result);
    }
    public static int add(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
}
/*structure of a method
public static int max(int a, int b)
A method header contains modifier (public, static), return type(int), parameter list(int a, int b)

Variables defined in a method are called formal parameters or simply parameters
 */
