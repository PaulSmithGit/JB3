package by.epam.unit03.main;

public class Task02 {
    public static void main(String[] args) {
        double prevSum, x, sum;

        prevSum = 0;
        x=1;
        sum = 0;

        System.out.println("______________________________________");
        System.out.printf("|\t%2s\t|\t%4s\t|\t%4s\t|\n", "x", "prevSum", "sum");
        System.out.println("______________________________________");

            while (x < 100) {
                prevSum=sum;
                sum = x + sum;
                System.out.printf("|\t%2.0f\t|\t%4.0f\t|\t%4.0f\t|\n", x, prevSum, sum);
                x = x + 2;
            }
        System.out.println("______________________________________");
    }
}
