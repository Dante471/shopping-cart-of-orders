package pro.sky.java.course2.shoppingcartoforders.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.shoppingcartoforders.domain.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@SessionScope
public class ShoppingCartOfOrdersServiceImpl implements ShoppingCartOfOrdersService {
    private final List<Product> shoppingCard = new ArrayList<>();

    @Override
    public void addProductToCart(List<Integer> productId) {
        for (Integer integer : productId) {
            shoppingCard.add(new Product(integer));
        }
    }

    @Override
    public Collection<Product> getShoppingCartOfOrders() {
        return shoppingCard;
    }

}
