public class Lift_bool {
    public static void main(String args[]){
        int weight_of_person = 68;
        int elevator_limit = 635;
        int number_of_people = elevator_limit / weight_of_person;

        int test_nop = 5;

        System.out.println("Может ли лифт поднять 10 человек?");

        boolean allTenOk = number_of_people >= 10; //Проверка 9 больше либо равно 10?
        System.out.println(allTenOk + "\n"); // Нет >>> false

        System.out.println("А может лифт поднять 5 человек?");

        boolean allTenOk1 = test_nop <= 10; // Проверка 5 меньше либо равно 10?
        System.out.println(allTenOk1 + "\n");// 5 меньше 10 >>> true
    }
}
