public class EcommerceSearchExampleTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(3, "Laptop", "Electronics"),
            new Product(1, "Shirt", "Clothing"),
            new Product(5, "Book", "Books"),
            new Product(2, "Phone", "Electronics"),
            new Product(4, "Shoes", "Footwear")
        };

        int searchId = 4;
        System.out.println("--- Linear Search ---");
        Product foundLinear = SearchUtils.linearSearch(products, searchId);
        System.out.println(foundLinear != null ? "Found: " + foundLinear : "Product not found");

        System.out.println("\n--- Binary Search (after sorting) ---");
        SearchUtils.sortProductsById(products);
        Product foundBinary = SearchUtils.binarySearch(products, searchId);
        System.out.println(foundBinary != null ? "Found: " + foundBinary : "Product not found");

        System.out.println("\n--- Analysis ---");
        System.out.println("Linear Search: O(n) time complexity. Suitable for small or unsorted datasets.");
        System.out.println("Binary Search: O(log n) time complexity. Requires sorted data, much faster for large datasets.");
        System.out.println("For an e-commerce platform with many products, binary search is preferred for performance, provided the data is sorted.");
    }
} 