public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int firstMonth = 1;
        int countInBank = 0;
        int payPerMont = 15000;
        while  (countInBank < 2_549_000) {
            countInBank += countInBank / 100;
            countInBank += payPerMont;
            System.out.println("Месяц " + firstMonth++ + ", сумма накоплений равна " + countInBank + " рублей.");
        }
    }
}