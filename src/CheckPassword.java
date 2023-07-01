import static java.lang.System.*;
import java.util.Scanner;
public class CheckPassword {
    public static void main(String args[]) {

        out.print("Добро пожаловать в систему!\nВведите пароль: ");

        Scanner my_scan = new Scanner(System.in);
        String myPassword = my_scan.next();

        out.println("\nAPI: Пользователь ввёл >>> " + myPassword + " <<<");
        out.println();

        if (myPassword.equals("java")){ // Можно как в питоне myPassword == "java". Лучше equals().
            out.print("Вход в систему выполнен успешно!\nНе забудьте проверить свои письма!\nХорошего дня!");
        }
        else{
            out.println("Введён неверный пароль!\nПопробуйте ещё раз");
        }

    }
}