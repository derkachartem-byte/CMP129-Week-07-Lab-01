import java.util.ArrayList;
public class Library {
    private String name;
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    public Library(String name){
        this.name = name;
        this.books = new ArrayList<Book>();
        this.members = new ArrayList<Member>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void registerMember(Member member){
        members.add(member);
    }
    public Book findBookByISBN(String isbn){
        for (Book b : books){
            if (b.getISBN().equals(isbn)){
                return b;
            }
        }
        return null;
    }
    public Member findMemberByID(String membershipID){
        for (Member m : members){
            if (m.getMemberShipID().equals(membershipID)){
                return m;
            }
        }
        return null;
    }
    public boolean borrowBook(String membershipID, String isbn){
        Member member = findMemberByID(membershipID);
        Book book = findBookByISBN(isbn);
        if (member == null || book == null){
            return false;
        }
        return member.borrowBook(book);
    }
    public boolean returnBook(String membershipID, String isbn){
        Member member = findMemberByID(membershipID);
        Book book = findBookByISBN(isbn);
        if (member == null || book == null){
            return false;
        }
        return member.returnBook(book);
    }
    public void displayBooks(){
        System.out.println("        Books  (" + name + ")   ");
        for (Book b : books){
            b.displayInfo();
        }
    }
    public void displayMembers(){
        System.out.println("        Members      ");
        for (Member m : members){
            m.displayInfo();
        }
    }
}
