public class UseAssignmentOperators {
    public static void main(String args[]){
        int number_of_bunny = 27;
        int extra_numbers = 53;

        number_of_bunny += 1;
        System.out.println("Количество кроликов: " + number_of_bunny);

        number_of_bunny -= 3;
        System.out.println("\nТрёх забрали.\nКоличество кроликов: " + number_of_bunny);

        number_of_bunny += extra_numbers;
        System.out.println("\nДобрые люди из компании 'Экстра' подарили нам 53 кролика!\nКоличество кроликов: " + number_of_bunny);

        number_of_bunny *= 2;
        System.out.println("\nПопуляция вырасла в двое!\nКоличество кроликов: " + number_of_bunny);

        number_of_bunny -= 10;
        System.out.println("\nДесяток крольчат забрали домой наши обыватели.\nКоличество кроликов: " + number_of_bunny);

        System.out.println("\nИтоговое количество кроликов: " + number_of_bunny);

    }
}
