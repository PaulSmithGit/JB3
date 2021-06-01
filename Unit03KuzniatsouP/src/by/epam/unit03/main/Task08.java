package by.epam.unit03.main;

    import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

        double x, y, z;
        String sign;
        Scanner sc = new Scanner(System.in);
        z=0;

            while (true) {
                System.out.print("X > ");
                if (sc.hasNext("#")) {
                    System.out.print("Выполнение завершено");
                    sc.close();
                    break;

                }

            while (!sc.hasNextDouble()) {
                System.out.print("X > ");
                sc.nextLine();
            }

            x = sc.nextDouble();
            System.out.print("Y > ");

            if (sc.hasNext("#")) {
                System.out.print("Выполнение завершено");
                sc.close();
                break;

            }

            while (!sc.hasNextDouble()) {
                System.out.print("Y > ");
                sc.nextLine();
            }
            y = sc.nextDouble();
            System.out.print("Знак операции > ");

            if (sc.hasNext("#"))  {
                System.out.print("Выполнение завершено");
                sc.close();
                break;
            }

            sign = sc.next();
            switch (sign) {
                case "+":
                    z = x + y;
                    System.out.println("Z = " + z);
                    break;
                case "-":
                    z = x - y;
                    System.out.println("Z = " + z);
                    break;
                case "*":
                    z = x * y;
                    System.out.println("Z = " + z);
                    break;
                case "/": if (y == 0) {
                    System.out.println("Я тебя сейчас на ноль поделю!");
                }
                else {
                    z = x / y;
                    System.out.println("Z = " + z);
                }
                    break;
                default : System.out.println("Неизвестная математическая операция");
                    break;
            }
        }
    }
}
