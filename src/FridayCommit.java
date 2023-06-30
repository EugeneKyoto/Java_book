import java.util.Scanner;
public class FridayCommit {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Введите количество нужного exp: ");
        int input = keyboard.nextInt();

        System.out.println("\nГМ выдал вам: " + input + " единиц exp!");
        keyboard.close();
    }

}
