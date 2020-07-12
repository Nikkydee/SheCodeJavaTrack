package Assignments;
//This Assignment is for learning path deliverable for Month 1 :
//2.	Write a program that takes the height and width of a square and print the box of that height and width with the alphabet ‘B’. E.g. if the user presses 5 for height and 8 for width, your program should print the
// following. (Restrict the user such that height or width should not be equal to zero).

public class PrintSquare {
    public static void main (String[] args) {
        Square s = new Square();
        s.height =5;
        s.width =8;
        for (int i =1; i<=s.height; i++){

            for (int j =1; j<=s.width; j++){

                System.out.print("B ");
            }
            System.out.println();
        }

    }


}
    class Square{

        int height;
        int width;
    }
