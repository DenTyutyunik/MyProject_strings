public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("Ф. И. О. сотрудника - %s", fullName);

        // Task 2
        System.out.println("\n\nTask 2");
        String fullNameFormatUpper = fullName.toUpperCase();
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета - %s", fullNameFormatUpper);

        // Task 3
        System.out.println("\n\nTask 3");
        String fullNameAnotherPerson = "Иванов Семён Семёнович";
        String fullNameAnotherPersonFormatWithoutYE = fullNameAnotherPerson.replace("ё", "е");
        System.out.printf("Данные Ф. И. О. сотрудника - %s", fullNameAnotherPersonFormatWithoutYE);
    }
}
