import java.time.LocalDate;
public class App {
    public static void main(String[] args) {
        var currentDate = LocalDate.now();
        var updDate = currentDate.toString();
        var upd2Date = updDate.replace("-", ".");
        var text = "Today is: " + upd2Date;
        System.out.println(text);
    }
    public static char getLastChar(String word) {
        return word.charAt(word.length()-1);
    }
    public static void getHiddenCard(String x) {
        x = "0123456789101213";

        x = x.substring(0, 12);
        x = "*".repeat(12)+x;
        System.out.println(x);
    }
}