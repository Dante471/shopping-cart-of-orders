package pro.sky.java.course2.shoppingcartoforders.service;

import pro.sky.java.course2.shoppingcartoforders.domain.Product;

import java.util.List;

public interface ShoppingCartOfOrdersService {
    List<Integer> addProductToCart(List<Integer> id);
    List<Product> getShoppingCartOfOrders();
}
