package LW5.Q1;



public class Book extends Borrowableitems {

    @Override
    public void displayinfo() {
        System.out.println("Title: "+title+","+"Author: "+author+","+"ISBN: "+isbn);
    }
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    public Book(){

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable(){
        return available;
    }

}
