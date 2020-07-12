package practice;

public class MethodCallStack {
    public static void main (String[] args) {
        int x=4, y=3;
        int answer = maxNum(x,y);
        System.out.println(answer);

    }

    public static int maxNum (int a, int b) {

        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;

        }
        return max;
    }

}

