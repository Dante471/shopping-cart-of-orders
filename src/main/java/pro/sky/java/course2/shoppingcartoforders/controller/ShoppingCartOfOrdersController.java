package pro.sky.java.course2.shoppingcartoforders.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.shoppingcartoforders.domain.Product;
import pro.sky.java.course2.shoppingcartoforders.service.ShoppingCartOfOrdersService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingCartOfOrdersController {
    private final ShoppingCartOfOrdersService shoppingCartService;

    public ShoppingCartOfOrdersController(ShoppingCartOfOrdersService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public List<Integer> addProductToCart(@RequestParam List<Integer> ids) {
        return shoppingCartService.addProductToCart(ids);
    }

    @GetMapping("/get")
    public List<Product> getShoppingCartOfOrders() {
        return shoppingCartService.getShoppingCartOfOrders();
    }
}
