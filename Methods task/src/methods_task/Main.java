package methods_task;
import java.util.Currency;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    static String CURRENCY = "EUR";
    static double quantity;
    static double price;

    public static void main(String[] args) {
        totalPurchaseAmount();
        discount();
        amountToPay();

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Input Price product: ");
        System.out.println("Input quantity: ");
        int price = sc1.nextInt();
        int quantity = sc2.nextInt();

        sc1.close();
        sc2.close();
    }
    public double income() {
        income = calcIncome(quantity, price);
        incomeRounded = roundValue(income);
    }

    private static double discount() {
        double taxRateA =5;
        double taxRateB =10;
        double taxRateC =15;

        if (income <= 5000) {
            return income * taxRateA/100 ;

        } else if (income > 5000 & income <= 10000) {
            return income * taxRateB/100;

        } else if (income > 10000) {
            return income * taxRateC/100;
        }
    }

    public double discount() {
        double discount = calculateDiscount();
        return income - discount;
    }

    public double amountToPay() {
        double discount = calculateDiscount();
        double amountToPay = calculateAmountToPay() ;

        !!!incomeRounded = roundValue(income);
        !!!discountRounded = roundValue(discount);
        !!!pureIncomeRounded = roundValue(pureIncome);
    }
    private static double calcIncome(double quantity, double price) {
        return quantity * price;
    }

    private static double calculateDiscount(double income) {
        return income * taxRateA / 100;
    }

    private static double calcPureIncome(double income, double discount) {
        return income - discount;
    }

    public static String roundValue(double value){
        return new DecimalFormat("#.00").format(value);
    }
}
