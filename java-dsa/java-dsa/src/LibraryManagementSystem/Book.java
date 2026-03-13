package LibraryManagementSystem;

public class Book {
    private String bookId;
    private String bookTitle;
    private String bookAuthor;

    public Book(String bookId, String bookTitle, String bookAuthor){
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }
    public String getBookId() {
        return bookId;

    }
    public void display(){
        System.out.println("Book ID: " +bookId + "Title: "+ bookTitle + "Auther: "+ bookAuthor);
    }

}
