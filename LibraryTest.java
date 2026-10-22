public class LibraryTest {
    public static void main(String[] args){
        Library lib = new Library("The Great Library");
        Book b1 = new Book("Linux", "Michael Smith", "5731");
        Book b2 = new Book("Leveling Up", "Johnny Depp", "9238");
        Book b3 = new Book ("Coding", "Hailey Chef", "2163");
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        Member m1 = new Member("Cinco", "01");
        Member m2 = new Member("Dan", "02");
        lib.registerMember(m1);
        lib.registerMember(m2);
        System.out.println("_____________________________________");
        lib.displayBooks();
        lib.displayMembers();
        System.out.println("_____________________________________");
        System.out.println("               TESTING               ");
        System.out.println("_____________________________________");
        System.out.println("Test 1: Cinco borrows 'Linux': ");
        if (lib.borrowBook("01", "5731")){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        System.out.println("Test 2: Dan tries to borrow a borrowed Book: ");
        if (!lib.borrowBook("02", "5731")){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        System.out.println("Test 3: Cinco Returns the book: ");
        if (lib.returnBook("01", "5731")){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        System.out.println("Test 4: Dan tries to borrow the return Book: ");
        if (lib.borrowBook("01", "5731")){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        System.out.println("Test 5: Cinco tries to borrow book with wrong ISBN: ");
        if (!lib.borrowBook("01", "9235")){
            System.out.println("Passed (Blocked invalid ISBN");
        } else {
            System.out.println("Failed");
        }
        System.out.println("Test 6: Not a member tries to borrow a book: ");
        if (!lib.borrowBook("Invalid_ID", "9238")){
            System.out.println("Passed (Blocked invalid Member");
        } else {
            System.out.println("Failed");
        }
        System.out.println("__________FINAL______________");
        lib.displayBooks();
        lib.displayMembers();
    }    
}
