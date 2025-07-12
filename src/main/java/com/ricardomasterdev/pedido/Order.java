package com.ricardomasterdev.pedido;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<Item> items;
    private final TotalCalculator calculator;

    // Injetamos a estratégia de cálculo (injeção de dependência)
    public Order(TotalCalculator calculator) {
        this.items = new ArrayList<>();
        this.calculator = calculator;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotal() {
        return calculator.calculate(items);
    }

    public List<Item> getItems() {
        return items;
    }
}