import java.util.Scanner;
public class TryScan {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in); // System.in == input() в Py.
        System.out.print("Сколько единиц древесины вам требуется?\nНапишите необходимое количество: ");
        int input_number = keyboard.nextInt();

        System.out.println("\nЛегко, " + input_number + " единиц мы сможем подготовить уже сегодня.\nПомощь прибудет на рассвете!");
        keyboard.close();

    }
}
