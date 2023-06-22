public class Dec { // Декремент.
    public static void main(String args[]){
        int i = 10;
        System.out.println("Значение переменной по умолчанию: " + i);
        System.out.println("Префикс декремента равен: " + --i); // Префиксная форма инкремента
        System.out.println("\nПостфикс декремента равен: " + i-- +"\nПосле i--, в следующем выражении переменная получится i = i - 1");
        System.out.println("Конечное значение переменной после префикса и постфикса равно: " + i);
        System.out.println(i--); //На выводе значение = 8, при следующем выводе переменная = i - 1.
        System.out.println(i); // 7
    }
}
