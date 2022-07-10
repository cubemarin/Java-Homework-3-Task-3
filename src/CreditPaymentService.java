public class CreditPaymentService {
    public double calculate(int amount, double percent, int period) {
        double monthlyPercent = percent / 12 / 100;
        double x = 1 + monthlyPercent;
        double y = period;

        double payment = amount * ((monthlyPercent) * Math.pow(x, y)) / ((Math.pow(x, y) - 1));

        return payment;
    }
}
