import java.time.LocalDate;
public class App {
    public static void main(String args[]) {
        var currentDate = LocalDate.now();
        var updDate = currentDate.toString();
        var upd2Date = updDate.replace("-", ".");
        var text = "Today is: " + upd2Date;
        System.out.println(text);
    }
}
//App.showCurrentDate();