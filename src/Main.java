public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        double percent = 9.99;
        System.out.println("Cумма кредита: " + credit + " р.");
        System.out.println("Количество месяцев: 1 г.");
        System.out.println("Процентная ставка: " + percent + " %");
        System.out.println("Ежемесячный платёж: " + service.calculate(credit, 1, percent) + " р.");
        System.out.println();
        System.out.println("Cумма кредита: " + credit + " р.");
        System.out.println("Количество месяцев: 2 г.");
        System.out.println("Процентная ставка: " + percent + " %");
        System.out.println("Ежемесячный платёж: " + service.calculate(credit, 2, percent) + " р.");
        System.out.println();
        System.out.println("Cумма кредита: " + credit + " р.");
        System.out.println("Количество месяцев: 3 г.");
        System.out.println("Процентная ставка: " + percent + " %");
        System.out.println("Ежемесячный платёж: " + service.calculate(credit, 3, percent) + " р.");
    }
}