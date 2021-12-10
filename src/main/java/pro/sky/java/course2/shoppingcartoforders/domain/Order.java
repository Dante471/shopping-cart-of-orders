package pro.sky.java.course2.shoppingcartoforders.domain;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Order {
    private final List<Product> shoppingCart = new ArrayList<>();

    public void add(Product product) {
        shoppingCart.add(product);
    }

    public List<Product> get() {
        return Collections.unmodifiableList(shoppingCart);
    }
}


