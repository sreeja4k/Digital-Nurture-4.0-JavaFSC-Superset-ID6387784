public class FinancialForecastingExampleTest {
    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.05; // 5% per period
        int periods = 10;

        System.out.println("--- Recursive Forecast ---");
        double futureRecursive = FinancialForecaster.futureValueRecursive(initialValue, growthRate, periods);
        System.out.printf("Future value (recursive): %.2f\n", futureRecursive);

        System.out.println("\n--- Iterative Forecast (Optimized) ---");
        double futureIterative = FinancialForecaster.futureValueIterative(initialValue, growthRate, periods);
        System.out.printf("Future value (iterative): %.2f\n", futureIterative);

        System.out.println("\n--- Analysis ---");
        System.out.println("Recursion simplifies problems by breaking them into smaller subproblems.\n" +
                "The recursive method here has O(n) time complexity (n = periods), as each call reduces periods by 1.\n" +
                "However, recursion can cause stack overflow for large n.\n" +
                "Optimization: Use iteration or memoization to avoid excessive computation and stack usage.");
    }
} 