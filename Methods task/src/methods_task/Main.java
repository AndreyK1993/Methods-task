package methods_task;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    private static final String CURRENCY = "EUR";
    static double income;
    static String incomeRounded;
    static double discount;
    static String discountRounded;
    static double amountToPay;
    static String amountToPayRounded;
    static double discountRateA =5;
    static double discountRateB =10;
    static double discountRateC =15;

    public static void main(String[] args) {


        Scanner sc1 = new Scanner(System.in);
        System.out.println("Input Price product: ");
        double price = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Input quantity: ");
        double quantity = sc2.nextInt();

        income = calcIncome(quantity, price);
        incomeRounded = roundValue(income);

        discount();
        amountToPay();
    }

    public static void discount() {

        if (income>0 && income <= 5000) {
            discount = income * discountRateA/100 ;

        } else if (income > 5000 & income <= 10000) {
            discount = income * discountRateB/100;

        } else if (income > 10000) {
            discount = income * discountRateC/100;
        }

    }

    public static void amountToPay() {
        double amountToPay = income - discount;
        amountToPayRounded = roundValue(amountToPay);
        getOutput();
    }

    private static void getOutput() {
        System.out.println(
                "\n" + "Income, " + CURRENCY + ": " + incomeRounded
                        + "\nDiscount, " + CURRENCY + ": " + discountRounded
                        + "\nAmount To Pay, " + CURRENCY + ": " + amountToPayRounded + "\n"
        );
    }
    private static double calcIncome(double quantity, double price) {
        return quantity * price;
    }

    public static String roundValue(double value){
        return new DecimalFormat("#.00").format(value);
    }
}