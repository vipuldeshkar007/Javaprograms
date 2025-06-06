package ComparableAndComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductSortingWIthComparator {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(101, "Laptop", 1500, 4.5),
                new Product(102, "Phone", 700, 4.7),
                new Product(103, "Tablet", 700, 4.3),
                new Product(104, "Monitor", 300, 4.7)
        );

        Collections.sort(products, Comparator.comparing(p -> p.productName));
        System.out.println("after sort by product name " +products);
        Collections.sort(products, Comparator.comparingDouble((Product p) ->p.price).
                thenComparing(Comparator.comparingDouble((Product p)-> p.rating).reversed().
                thenComparing(Comparator.comparing((Product p) -> p.productName ))));
        System.out.println("after sort by price, rating,  product name " +products);

    }
}


class Product {
    int productId;
    String productName;
    double price;
    double rating;

    public Product(int productId, String productName, double price, double rating) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId + ", productName='" + productName + '\'' +
                ", price=" + price + ", rating=" + rating + '}';
    }
}