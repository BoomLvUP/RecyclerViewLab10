package com.example.recyclerview.model;

public class Food {
    private int id;
    private String image;
    private String name;
    private String price;

    public Food(int id, String image, String name, String price) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getImage() { return image; }
    public String getName() { return name; }
    public String getPrice() { return price; }
}
