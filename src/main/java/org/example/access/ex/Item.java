package org.example.access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    // 외부에서는 단순히 이 메서드를 호출하기만 하면됨.
    public int getTotalPrice() {
        return price * quantity;
    }
}
