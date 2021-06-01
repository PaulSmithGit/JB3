package by.epam.unit03.main;

public class Task06 {

    public static void main(String[] args) {

        int x, y, a, b;
        x = 12345;
        y = 45678;
        System.out.println("x = " + x + ", y = " + y);

        while (x > 0) {
            b = x % 10;
            x = x / 10;
            a = y;
            while (a > 0) {
                if (a % 10 == b) {
                    System.out.println("Входит в запись обоих чисел: " + b);
                }
                a = a / 10;
            }
        }
    }
}
