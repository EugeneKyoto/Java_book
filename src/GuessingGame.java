import static java.lang.System.in; // Относится ко вводу с клавиатуры -> System in.
import static java.lang.System.out; // Импорт необходимых пакетов данных.
import  java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in); //Создаём новую переменную, которая считывает инфу с клавы.
        // Scanner - это имя Класса!
        out.print("Введите число от 1 до 10: ");

        int input_number = keyboard.nextInt(); // Переменная = input().Ожидаемый ввод значения int.
        int random_nuber = new Random().nextInt(10) + 1;

        if(input_number == random_nuber){
            out.println("**************");
            out.println("*Bы выиграли.*");
            out.println("**************");
        }
        else{
            out.println("\nВы проиграли...");
            out.println("\nСлучайное число равно: " + random_nuber + ".");
        }
        out.println("Спасибо за игру!");
        keyboard.close(); //Не забывать выключать ввод с клавиатуры.
    }
}
