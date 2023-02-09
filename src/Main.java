public class Main {
    public static void main(String[] args) {
        int Balance = 100;
        int Replenishment = 1000;

        int bonus;
        if (Replenishment <  1000) {
            bonus = Replenishment + 100;

        } else {

            bonus = Replenishment / 100;
        }
        Balance = Balance + Replenishment + bonus;

        System.out.println(" Количество бонусов: " + bonus);
        System.out.println( " Итоговый баланс: " + Balance);
    }
}