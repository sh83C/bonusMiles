public class Main {

    public static void main(String[] args) {

        int ticketPrice = 5019;
        int bonusMile = 20;
        int bonus = ticketPrice / bonusMile;

        System.out.println("Сумма Вашей покупки: " + ticketPrice + " рублей");
        System.out.println("Количество бонусных миль, начисленных за покупку билета: " + bonus);
    }
}