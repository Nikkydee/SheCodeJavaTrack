package LPMonth1Assignment;
/*2. Write a program that takes the height and width of a square and print the box
of that height and width with the alphabet ‘B’. E.g. if the user presses 5 for height and 8 for width,
 your program should print the following. (Restrict the user such that height or width should not beequal to zero).*/
import java.util.Scanner;

public class PrintSquare2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner ( System.in );

        System.out.print ( "Enter the height of the square : " );
        int height = scanner.nextInt ( );

        System.out.print ( "Enter the width of the square :" );
        int width = scanner.nextInt ( );
        scanner.close ( );

        if (height > 0 || width > 0) {

            for (int i = 1; i <= height; i++) {

                for (int j = 1; j <= width; j++) {

                    System.out.print ( "B " );
                }
                System.out.println ( );
            }
        } else {
            System.out.println ( "Please enter a value greater than zero for height nd width" );
        }
    }

}

