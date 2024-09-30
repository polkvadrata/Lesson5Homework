package app;

import java.util.Scanner;

public class mainProgram {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of your income $");
        int incomeAmount = scanner.nextInt();
        double tax;

        if (incomeAmount <= 0) {
            System.out.println("invalid value, income must be >= 0$");
            return;
        }

        if (incomeAmount <= 10000) {
            tax = incomeAmount * 0.025;
        } else if (incomeAmount <= 25000) {
            tax = incomeAmount * 0.043;
        } else {
            tax = incomeAmount * 0.067;
        }

        System.out.printf("Your income tax is %.2f $",tax);

    }

}
