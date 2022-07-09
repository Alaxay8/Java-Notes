import java.util.Scanner;

public class if_else_switch_case {
    public static void main(String [] args) {
        /*
        && - И
        || - ИЛИ
        ! -НЕ
        ^ - XOR
         */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println(x + " more than 0");
        } else if (x < 0) {
            System.out.println(x + " less than 0");
        } else {
            System.out.println(x + " is equal 0");
        }
        // switch-case:
        short a;
        //System.out.print("0 - выход из программы\n1 - площадь треугольника\n2 - площадь прямоугольника\n3 - площадь круга");
        a = sc.nextShort();
        switch (a) {
            case 1: System.out.println("Выбрана площадь треугольника"); break;
            case 2: System.out.println("Выбрана площадь прямоугольника"); break;
            case 3: System.out.println("Выбрана площадь круга"); break;
            default: System.out.println("Не выбрал ни один пункт меню"); break;
        }
        //break здесь необходим, чтобы после выбора кейса не выполнялись дальнейшие условия после него
        sc.close();
    }
}
