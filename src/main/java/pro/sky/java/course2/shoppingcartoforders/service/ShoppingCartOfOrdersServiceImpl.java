package pro.sky.java.course2.shoppingcartoforders.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.shoppingcartoforders.domain.Order;
import pro.sky.java.course2.shoppingcartoforders.domain.Product;

import java.util.Collection;
import java.util.List;

@Service

public class ShoppingCartOfOrdersServiceImpl implements ShoppingCartOfOrdersService {

    private final Order order;

    public ShoppingCartOfOrdersServiceImpl(Order order) {
        this.order = order;
    }

    @Override
    public List<Integer> addProductToCart(List<Integer> ids) {
        ids.stream()
                .map(Product::new)
                .forEach(order::add);
        return ids;
    }

    @Override
    public Collection<Product> getShoppingCartOfOrders() {
        return order.get();
    }

}
