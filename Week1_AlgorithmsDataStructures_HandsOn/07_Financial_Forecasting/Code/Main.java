import java.util.Scanner;

public class Main {

    public static double calculateFutureAmount(double amount, double growthRate, int duration) {

        if (duration <= 0) {
            return amount;
        }

        return calculateFutureAmount(amount, growthRate, duration - 1)
                * (1 + growthRate);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      Financial Forecasting");
        System.out.println("=================================");

        System.out.print("Enter initial investment: ");
        double investment = input.nextDouble();

        System.out.print("Enter annual growth rate: ");
        double growthRate = input.nextDouble();

        System.out.print("Enter investment period (years): ");
        int duration = input.nextInt();

        double forecastedAmount = calculateFutureAmount(investment, growthRate, duration);

        System.out.printf(
                "%nEstimated value after %d years: %.2f%n",
                duration,
                forecastedAmount);

        input.close();
    }
}