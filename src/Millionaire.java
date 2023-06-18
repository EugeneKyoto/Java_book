public class Millionaire {
    public static void main(String args[]){
        double amountInAccount; // Тип double(64 bit) более точный, чем float(32 bit).

        amountInAccount = 50.22;
        amountInAccount = amountInAccount + 1_000_000.00;

        System.out.println("На Вашем счёте: " + amountInAccount + "$.\n");
        System.out.println("Идёт обработка информации...\n");

        amountInAccount = amountInAccount + 1_000_000.00;
        System.out.println("Транзакция успешно выполнена!\nТеперь на вашем счёте: " + amountInAccount +"$.");
    }
}

