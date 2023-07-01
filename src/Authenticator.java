import javax.swing.JOptionPane;
public class Authenticator {
    public static void main(String args[]){
        String username = JOptionPane.showInputDialog("Имя пользователя: ");
        String password = JOptionPane.showInputDialog("Пароль: ");
        /*
        && == OR;
        || == AND;
        != == NOT;
         */
        // username != содержит какое-то значение..
        if (
                username != null && password != null && //Если не нажали отменить, то ...
        (
                (username.equals("bird") && password.equals("food")) ||
                        (username.equals("star") && password.equals("st"))
                )
        )
        {
            JOptionPane.showMessageDialog(null, "Вы допущены в систему!");
            //null - нет других диалоговых окон.
        }
        else {
            JOptionPane.showMessageDialog(null, "Попытайтесь ещё раз!");
        }
        int howtocow = Integer.parseInt(JOptionPane.showInputDialog("Сколько коров пасётся на лужайке?"));
        if (howtocow== 8){
            JOptionPane.showMessageDialog(null, "Спасибо за информацию!\nПродолжайте наблюдение.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Не верно.\nСмотри внимательней!");
        }
    }
}
