package ru.andreysozonov.materialdesignproject.model;

public class ItemCardModel {

    private int imageId;
    private String title;
    private String year;
    private String director;

    public ItemCardModel(int imageId, String title, String year, String director) {
        this.imageId = imageId;
        this.title = title;
        this.year = year;
        this.director = director;
    }


    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
