package com.ricardomasterdev.pedido;

import java.util.List;

// Interface para estratégia de cálculo
public interface TotalCalculator {
    double calculate(List<Item> items);
}