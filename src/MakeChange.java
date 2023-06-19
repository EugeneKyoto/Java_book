import static  java.lang.System.out;

public class MakeChange {
    public static void main(String args[]){
        int total = 248;

        int quarters = total / 25;
        int whatsLeft = total % 25;

        int dimes = whatsLeft / 10;
        whatsLeft = whatsLeft % 10;

        int nickels = whatsLeft / 5;
        whatsLeft = whatsLeft % 5;

        int centes = whatsLeft;

        System.out.println("Сумма " + total + " центов, может быть выдана следующими монетами: ");
        System.out.println("1) " + quarters + " монет достоинством 25 центов.");
        System.out.println("2) " + dimes + " монет достоинством 10 центов.");
        System.out.println("3) " + nickels + " монет достоинством 5 центов.");
        System.out.println("4) " + centes + " монет достоинством 1 цент.");
    }
}
