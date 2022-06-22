package com.example.gb_projecting_app;

public abstract class Library_document {
    protected String Label; // Наименование
    protected String Author; // Автор
    protected int ID; // Идентификатор
    protected String Image; // Электронный образ

    abstract String Show_document();

    public void setLabel(String label) {
        Label = label;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLabel() {
        return Label;
    }

    public String getAuthor() {
        return Author;
    }

    public int getID() {
        return ID;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
