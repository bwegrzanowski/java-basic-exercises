package oop.bookstore;

import java.util.ArrayList;

public class Book {
    private String description;
    private String title;
    private int releaseYear;
    private String publisher;
    private Author author;

    public Book(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }
    public String getAuthor() {
        return author != null ? author.getName() : null;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "description='" + description + '\'' +
                ", author='" + (author !=null ? author.getName() : "") + '\'' +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
