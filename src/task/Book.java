package task;


import java.util.Objects;

public class Book {
    private String nameBook;
    private int year;
    private Author author;


    public Book(String nameBook, Author author, int yaer) {
        this.author = author;
        this.nameBook = nameBook;
        this.year = yaer;
    }

    public String getNameBook() {
        return nameBook;
    }
    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, year, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", year=" + year +
                ", author='" + author.toString() + '\'' +
                '}';
    }
}



