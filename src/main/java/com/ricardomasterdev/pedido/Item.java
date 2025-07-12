package com.ricardomasterdev.pedido;

// Classe de domínio Item
public class Item {
    private final String nome;
    private final double price;

    public Item(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getNome() {
        return nome;
    }
}
