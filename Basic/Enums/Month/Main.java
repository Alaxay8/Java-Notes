import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Month month = Month.May;
        switch (month) {
            case January: System.out.println("It's January now"); break;
            case February: System.out.println("It's February now"); break;
            case March: System.out.println("It's March now"); break;
            case April: System.out.println("It's April now"); break;
            case May: System.out.println("It's May now"); break;
            case June: System.out.println("It's June now"); break;
            case July: System.out.println("It's July now"); break;
            case August: System.out.println("It's August now"); break;
            case September: System.out.println("It's September now"); break;
            case October: System.out.println("It's October now"); break;
            case November: System.out.println("It's November now"); break;
            case December: System.out.println("It's December now"); break;
        }
        System.out.println(month instanceof Month);
    }
}
