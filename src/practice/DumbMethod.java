package practice;

public class DumbMethod {
    public static void main (String[] args) {
        add();
        subtract();
        multiply();
    }
    public static void add(){
        int a = 10, b = 5;
        int sum = a+b;
        System.out.println ( sum );
    }
    public static void subtract(){
        int a =10, b =5;
        int sum = a-b;
        System.out.println ( sum );
    }
    public static void multiply(){

        int a =10, b =5;
        int sum = a*b;
        System.out.println ( sum );
    }
}
