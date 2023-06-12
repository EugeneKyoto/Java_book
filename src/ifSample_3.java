public class ifSample_3 {
    public static void main(String[] args){
        int x = 10; // Вот она, статическая типизация.
        int y = 20;

        if (x < y) System.out.println("x меньше, чем y."); // Условный оператор if в Java.

        x = x *2; // Теперь x = 20.
        if (x == y) System.out.println("x теперь равно у.");

        x = x * 2; // Теперь х = 40.
        if (x > y) System.out.println("x теперь больше y.");
    }
}
