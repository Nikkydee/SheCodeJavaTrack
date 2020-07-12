package practice;


public class AmbuiguousOverloading {

    public static void main (String[] args) {
        Maths maths = new Maths();
        maths.max ( 5.0, 7 );

    }
}
        class Maths {
            public void max (int x, double y) {

                System.out.println ( "double version called" );
            }

            public void max (double x, int y) {
                System.out.println ( "integer version called" );
            }
        }


