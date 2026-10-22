import java.util.ArrayList;
public class Member {
    private String name;
    private String membershipID;
    private ArrayList<Book> borrowedBooks; 
    public Member(String name, String membershipID){
        this.name = name;
        this.membershipID = membershipID;
        this.borrowedBooks = new ArrayList<Book>();
    }
   
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getMemberShipID(){
        return membershipID;
    }
    public void setMemberShipID(String membershipID){
        this.membershipID = membershipID;
    }
    public ArrayList<Book> getBorrowedBooks(){
        return borrowedBooks;
    }
    public boolean borrowBook(Book book){
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(true);
            return true;
        }
        return false;
    }
    public boolean returnBook(Book book){
        if (borrowedBooks.contains(book)){
            borrowedBooks.remove(book);
            book.setAvailable(true);
            return true;
        }
        return false;
    }
    public void displayInfo(){
        System.out.println("Member: " + name + " (ID: " + membershipID + ")");
        if (borrowedBooks.isEmpty()){
            System.out.println(" No books taken out.");
        } else {
            System.out.println(" Borrowed Books:");
            for (Book book : borrowedBooks){
                System.out.println("  -" + book.getTitle());
            }
        }
    }

}
