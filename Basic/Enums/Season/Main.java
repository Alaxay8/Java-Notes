import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Season season = Season.Spring;
        switch (season) {
            case Winter: System.out.println(season.getTranslation()); break;
            case Spring: System.out.println(season.getTranslation()); break;
            case Summer: System.out.println(season.getTranslation()); break;
            case Autumn: System.out.println(season.getTranslation()); break;
        }
    }
}
