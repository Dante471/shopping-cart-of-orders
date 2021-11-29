package pro.sky.java.course2.shoppingcartoforders.domain;

import java.util.Objects;

public class Product {
    private final int productId;

    public Product(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return productId == product.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                '}';
    }
}
