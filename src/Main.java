public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1000000; // сумма кредита
        double percent = 9.99; // годовая процентная ставка
        int period = 12; // срок кредита в месяцах
        double payment = service.calculate(amount, percent, period); // ежемесячный платеж
        System.out.println(payment);

        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту на сумму 1 млн рублей на 1 год с процентной ставкой 9,99% в год: ");
        System.out.println(service.calculate(1000000, 9.99, 12));

        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту на сумму 1 млн рублей на 2 года с процентной ставкой 9,99% в год: ");
        System.out.println(service.calculate(1000000, 9.99, 24));

        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту на сумму 1 млн рублей на 3 года с процентной ставкой 9,99% в год: ");
        System.out.println(service.calculate(1000000, 9.99, 36));


    }
}
