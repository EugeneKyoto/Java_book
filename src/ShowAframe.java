import javax.swing.JFrame;
public class ShowAframe {
    public static void main(String args[]){
        JFrame myFrame = new JFrame();//Создаём новую рамку UI программы.
        String myTitle = "Пустой фрейм";//Пишем название программы.

        myFrame.setTitle(myTitle);//Устанавливаем имя для фрейма.
        myFrame.setSize(300,200);//Устанавливаем размер.
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Устанавливаем базовые функции взаимодействия.
        myFrame.setVisible(true);//Включаем видимость программы.
    }
}
