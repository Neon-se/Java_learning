import java.util.Scanner;

public class App {
    public static void main(String[] args ) {
        /*
            1. Если <18 - янг
            2. Если >17 || <65 - эдулть
            3. Если >64 -> пенсионьер
         */

        var in = new Scanner(System.in);

        System.out.print("\u001B[33mСколько вам лет?\nМне: ");
        int age = in.nextInt();
        String pers;

        if (age < 17) {
            pers = "янг";
        } else if (age > 65) {
            pers = "пенсионьер";
        } else {
            pers = "эдулть";
        }
        System.out.println("Вы - \u001B[11m"+pers+"");


        System.out.print("\u001B[33mВведите первое число: ");
        int a = in.nextInt();
        System.out.print("\nВведите второе число: ");
        int b = in.nextInt();

        if (a > b) {
            System.out.printf("\n%d больше %d\n", a, b);
        } else if (a < b) {
            System.out.printf("%d больше %d\n", b, a);
        } else {
            System.out.printf("%d равно %d\n", b, a);
        }

        in.close();
    }
}
