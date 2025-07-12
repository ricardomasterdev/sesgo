package com.ricardomasterdev.pedido;

import java.util.List;

// Implementação padrão do cálculo total
public class DefaultTotalCalculator implements TotalCalculator {
    @Override
    public double calculate(List<Item> items) {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
}