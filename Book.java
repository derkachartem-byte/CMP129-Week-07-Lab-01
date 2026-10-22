public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author; 
        this.isbn = isbn;
        this.available = true;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getISBN(){
        return isbn;
    }
    public void setISBN(String isbn){
        this.isbn = isbn;
    }
    public boolean isAvailable(){
        return available;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }
    public void displayInfo(){
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Availability: " + available);
    }
}
