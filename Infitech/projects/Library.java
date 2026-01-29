import java.util.*;
class Book {
    String title;
    boolean isAvailable;
    Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }
}
public class Library {
    static List<Book> books = new ArrayList<>();
    public static void main(String[] args) {
        initializeBooks();
        Scanner sc = new Scanner(System.in);
        int choice;
        do { 
            System.out.println("\nLibrary Menu:");
            System.out.println("1. View Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: viewBooks(); break;
                case 2: 
                    System.out.print("Enter book title to borrow: ");
                    borrowBook(sc.nextLine());
                    break;
                case 3: 
                    System.out.print("Enter book title to return: ");
                    returnBook(sc.nextLine());
                    break;
                case 4: 
                    System.out.println("Exiting..."); 
                    break;
                default: 
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
    static void initializeBooks() {
        books.add(new Book("Java Basics"));
        books.add(new Book("Python Programming"));
        books.add(new Book("Data Structures"));
        books.add(new Book("Algorithms in C"));
    }
    static void viewBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            String status = book.isAvailable ? "Available" : "Issued";
            System.out.println("- " + book.title + " [" + status + "]");
        }
    }
    static void borrowBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                if (book.isAvailable) {
                    book.isAvailable = false;
                    System.out.println("You borrowed: " + book.title);
                } else {
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
    static void returnBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                if (!book.isAvailable) {
                    book.isAvailable = true;
                    System.out.println("You returned: " + book.title);
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
