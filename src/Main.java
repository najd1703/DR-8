public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    System.out.println("Задача 1");
    String firstName = "Ivanov";
    String mildName = " Ivan";
    String lastName = " Ivanovich";
    String follName = firstName +  mildName + lastName;
        System.out.println("Ф.И.О. сотрудника- " + follName);

        System.out.println("Задача 2");

    String firstName1 = "Ivanov";
    String mildName1 = " Ivan";
    String lastName1 = " Ivanovich";
    String follName1 = firstName1 +  mildName1 + lastName1;
        System.out.println(follName1.toUpperCase());

        System.out.println("Задача 3");

    String name = "Иванов Семён Семёнович";
    String name2 = name.replace('ё', 'е');
        System.out.println(name2);

}}