package org.example.com.helloshop.order;

import org.example.com.helloshop.product.Product;
import org.example.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        // public이 붙어야 다른 패키지에서 호출 가능.
        this.user = user;
        this.product = product;
    }
}

