package com.ivansuhendra.myapplication;

public class Movie {
    private int id;
    private String name;
    private String description;
    private int price;
    private String imageUrl;
    private int year;
    private String added;

    // Constructor, getters, and setters
    public Movie(int id, String name, String description, int price, String imageUrl, int year, String added) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.year = year;
        this.added = added;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getPrice() { return price; }
    public String getImageUrl() { return imageUrl; }
    public int getYear() { return year; }
    public String getAdded() { return added; }
}
