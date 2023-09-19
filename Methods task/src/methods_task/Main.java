package methods_task;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Main {
    private static final String CURRENCY = "EUR";
    static double income;
    static String incomeRounded;
    static double discount;
    static String amountToPayRounded;
    static double[] discountRates = {5, 10, 15};

    public static void main(String[] args) {

        double price = readDoubleInput("Input Price product: ");
        double quantity = readDoubleInput("Input quantity: ");

        income = calcIncome(quantity, price);
        incomeRounded = roundValue(income);

        discount();
        amountToPay();
    }

    private static double readDoubleInput(String prompt) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public static void discount() {

        if (income>0 && income <= 5000) {
            discount = income * discountRates[0]/100 ;

        } else if (income > 5000 & income <= 10000) {
            discount = income * discountRates[1]/100;

        } else if (income > 10000) {
            discount = income * discountRates[2]/100;
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
                        + "\nDiscount, " + CURRENCY + ": " + discount
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