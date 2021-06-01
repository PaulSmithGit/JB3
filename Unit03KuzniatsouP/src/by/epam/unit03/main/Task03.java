package by.epam.unit03.main;

public class Task03 {

    public static void main(String[] args) {
        double x, sum, res;

        x = 1;
        sum = 1;
        res = 1;

        System.out.println("______________________________________");
        System.out.printf("|\t%2s\t|\t%2s\t|\t%13s\t|\n", "x", "sum", "res");
        System.out.println("______________________________________");
        System.out.printf("|\t%2.0f\t|\t%2.0f\t|\t%13.0f\t|\n", x, sum, res);

            for(double i = 1; i <= 9; i++) {
                x++;
                sum = sum + x;
                res = sum * res;
                System.out.printf("|\t%2.0f\t|\t%2.0f\t|\t%13.0f\t|\n", x, sum, res);
            }
        System.out.println("______________________________________");
        System.out.printf("Result = %13.0f", res);
    }
}
