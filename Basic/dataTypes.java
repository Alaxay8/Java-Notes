public class dataTypes {
    byte a; // от -128 до 127, занимает 1 байт
    short b; // от -32768 до 32767, занимает 2 байта
    int c; // от -2147483648 до 2147483647 занимает 4 байта
    long d; // от -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 занимает 8 байт
    float e; // от -3.4 * 10^38 до 3.4 * 10^38 занимает 4 байта
    double f; // от +/- 4.9 * 10^-324  до +/- 1.8 * 10^-308 занимает 8 байт
    char g; /* для одиночного символа в кодировке UTF-16, занимает 2 байта.
        также можно записать целые числа в диапазоне от 0 до 65 535. */
    boolean h; // для булевых значений true и false. Размер спецификацией строго не определен.
    final float PI = 3.14f; // Константа, принято писать заглывными буквами.
}