public class BlockTest_5 {
    public static void main(String[] args){
        int x, y, counter;
        y = 20;
        counter = 1; // Счётчик для счётного цикла, оригинально? ахаха

        for(x = 0; x < 10; x++){ // Начало блока кода.
            System.out.println(counter + ") Значение х = " + x + ".");
            System.out.println(counter + ") Значение у = "+ y + ".\n");
            y = y - 2;
            counter = counter + 1;
        } // Конец блока кода.
    }
}
