package ru.mirea.oop.practice.coursej.s131226.entities;


public class Item {
    private final int article;
    private final int price;

    public Item(int article, int price) {
        this.article = article;
        this.price = price;
    }

    public int getArticle() {
        return article;
    }

    public int getPrice() {
        return price;
    }
}