package org.example.com.helloshop.order;

import org.example.com.helloshop.product.Product;
import org.example.com.helloshop.user.User;

public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
