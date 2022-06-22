package com.example.gb_projecting_app;

public class Book extends Library_document {
    private String Publishing_house;

    public Book(String label, String author, int ID, String publishing_house, String image) {
        super.setLabel(label);
        super.setAuthor(author);
        super.setID(ID);
        super.setImage(image);
        this.Publishing_house = publishing_house;
    }

    public String getPublishing_house() {
        return Publishing_house;
    }

    @Override
    public String Show_document() {
        return "";
    }
}
