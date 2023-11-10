package com.example.moviestime;

public class Movie {
    private String title;
    private String genre;
    private int releaseYear;
    private double rating;
    private String watchLink;
    private int posterResourceId; //ID изображения в ресурсах

    public Movie(String title, String genre, int releaseYear, double rating, String watchLink, int posterResourceId) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.watchLink = watchLink;
        this.posterResourceId = posterResourceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getWatchLink() {
        return watchLink;
    }

    public void setWatchLink(String watchLink) {
        this.watchLink = watchLink;
    }

    public int getPosterResourceId() {
        return posterResourceId;
    }

    public void setPosterResourceId(int posterResourceId) {
        this.posterResourceId = posterResourceId;
    }
}
