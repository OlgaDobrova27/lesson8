
public class Main {
    public static void main(String[] args) {
        {
            // Задание 1

            String firstName;
            firstName = "Ivan";

            String middleName = "Ivanovich";
            String LastName = "Ivanov";
            String fullName = LastName + " " + firstName + " " + middleName;

            System.out.println("ФИО сотрудника - " + fullName);
        }
        // Задание 2

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String LastName = "Ivanov";
        System.out.printf("Данные ФИО сотрудника для заполнения отчета - %S %S %S", firstName, middleName, LastName);

    // Задание 3

        System.out.println();
    String fullName = "Иванов Семён Семёнович";
    String result = fullName.replace("ё", "е");


        System.out.printf("Данные ФИО сотрудника - %s", result);
    }
}





