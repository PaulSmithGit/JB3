package by.epam.unit03.main;

    import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);
        String Rom, Arab;
        System.out.print("Введите римскую цифру > ");
        Rom = sc.nextLine();
        sc.close();
        System.out.println("Римская цифра = " + Rom);

            switch (Rom) {
                case "I":
                    Arab = "1";
                    break;
                case "V":
                    Arab = "5";
                    break;
                case "X":
                    Arab = "10";
                    break;
                case "L":
                    Arab = "50";
                    break;
                case "C":
                    Arab = "100";
                    break;
                case "D":
                    Arab = "500";
                    break;
                case "M":
                    Arab = "1000";
                    break;
                default:
                    Arab = "Это не Римская Цифра";
                    break;
            }
        System.out.println("Арабская цифра = " + Arab);
    }
}
