package org.example.additional_task.task13_09_23;

public class Book {
   private   String title;
   private String author;
   private int year;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    private int page;

    public Book(String title, String author, int year,int page) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book " +
                "title:'" + title + '\'' +
                ", author:'" + author + '\'' +
                ", year:" + year + ", page:" + page;

    }
}