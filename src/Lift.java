public class Lift {
    public static void main(String atgs[]){
        int weight_of_person;
        int elevator_limit;
        int number_of_people;

        weight_of_person = 70;
        elevator_limit = 635;
        number_of_people = elevator_limit / weight_of_person;

        System.out.println("Лифт 'ElevatorPro3000' может поднять: " + number_of_people + " человек.");
    }
}
