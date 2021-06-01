package by.epam.unit03.main;

public class Task01 {

    public static void main(String[] args) {
        double a, b, mult;
        a=3;

        System.out.println("______________________________________");
        System.out.printf("|\t%2s\t|\t%2s\t|\t%2s\t|\n", "a", "b", "result");
        System.out.println("______________________________________");

            for(b = 1; b < 11; b++) {
                mult = a * b;
                System.out.printf("|\t%2.0f\t|\t%2.0f\t|\t%2s\t|\n", a, b, mult);
            }
        System.out.println("______________________________________");
    }
}
