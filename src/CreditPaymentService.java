public class CreditPaymentService {
    public double calculate(int credit, int year, double percent) {
        double payment = credit * ((percent / (100 * 12)) / (1 - (Math.pow((1 + (percent / (100 * 12))), (year * - 12)))));
        return (int) payment;
    }
}
