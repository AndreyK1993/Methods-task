package methods_task;
import java.util.Currency;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    private static final String CURRENCY = "EUR";
    static double quantity;
    static double price;
    static double income;
    static String incomeRounded;
    static double discount;
    static String discountRounded;
    static double pureIncome;
    static String pureIncomeRounded;

    public static void main(String[] args) {
        discount();
        amountToPay();

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Input Price product: ");
        System.out.println("Input quantity: ");
        int price = sc1.nextInt();
        int quantity = sc2.nextInt();

        income = calcIncome(quantity, price);
        incomeRounded = roundValue(income);
        //????
        sc1.close();
        sc2.close();
    }

    private static double discount() {
        double discountRateA =5;
        double discountRateB =10;
        double discountRateC =15;

        if (income <= 5000) {
            return income * discountRateA/100 ;

        } else if (income > 5000 & income <= 10000) {
            return income * discountRateB/100;

        } else if (income > 10000) {
            return income * discountRateC/100;
        }

        double discount = calculateDiscount();
        return income - discount;
    }

    public static void amountToPay() {
        double discount = calculateDiscount();
        double amountToPay = calculateAmountToPay() ;

        incomeRounded = roundValue(income);
        discountRounded = roundValue(discount);
        pureIncomeRounded = roundValue(pureIncome);
    }
    private static double calcIncome(double quantity, double price) {
        return quantity * price;
    }
    private static double calculateDiscount(double income) {
        return income * discountRateA / 100;
    }
    private static double calculateAmountToPay(double income, double discount) {
        return income - discount;
    }
    public static String roundValue(double value){
        return new DecimalFormat("#.00").format(value);
    }
}