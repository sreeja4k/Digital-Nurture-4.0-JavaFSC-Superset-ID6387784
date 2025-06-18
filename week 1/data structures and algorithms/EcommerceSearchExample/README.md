# EcommerceSearchExample

## 1. Asymptotic Notation (Big O)
- **Big O notation** describes the upper bound of an algorithm's running time as the input size grows. It helps compare algorithms' efficiency.
- **Best case:** The minimum time taken (e.g., first element match).
- **Average case:** The expected time over all possible inputs.
- **Worst case:** The maximum time taken (e.g., element not found).

## 2. How to Compile and Run
1. Open a terminal and navigate to the `EcommerceSearchExample` directory.
2. Compile the Java files:
   ```sh
   javac src/main/java/*.java
   ```
3. Run the test class:
   ```sh
   java -cp src/main/java EcommerceSearchExampleTest
   ```

## 3. Analysis
- **Linear Search:** O(n) time. Checks each element. Good for small/unsorted data.
- **Binary Search:** O(log n) time. Requires sorted data. Much faster for large datasets.
- **Recommendation:** For large e-commerce platforms, use binary search with sorted data for best performance. 