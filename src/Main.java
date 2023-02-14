public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 1000;

        int bonus;
        if (replenishment < 1000) {
            bonus = 0;

        } else {

            bonus = replenishment / 100;
        }
        balance = balance + replenishment + bonus;

        System.out.println(" Количество бонусов: " + bonus);
        System.out.println(" Итоговый баланс: " + balance);
    }
}