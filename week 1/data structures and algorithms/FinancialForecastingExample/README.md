# FinancialForecastingExample

## 1. Recursion Explained
- **Recursion** is a technique where a method calls itself to solve smaller instances of a problem. It can simplify code for problems that have a natural recursive structure (e.g., computing future values over periods).

## 2. How to Compile and Run
1. Open a terminal and navigate to the `FinancialForecastingExample` directory.
2. Compile the Java files:
   ```sh
   javac src/main/java/*.java
   ```
3. Run the test class:
   ```sh
   java -cp src/main/java FinancialForecastingExampleTest
   ```

## 3. Analysis
- **Time Complexity:** The recursive forecasting method has O(n) time complexity (n = periods).
- **Optimization:** For large n, recursion can cause stack overflow. Use iteration or memoization to optimize and avoid excessive computation. 