package com.ricardomasterdev.pedido;

public class Main {
    public static void main(String[] args) {
        TotalCalculator calculator = new DefaultTotalCalculator();
        Order order = new Order(calculator);

        order.addItem(new Item("Caneta", 2.50));
        order.addItem(new Item("Caderno", 15.00));

        System.out.printf("Total do pedido: R$ %.2f%n", order.calculateTotal());
    }
}
