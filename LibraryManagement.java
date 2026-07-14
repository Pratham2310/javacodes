import java.util.Scanner;

public class LibraryManagement {
    String[] books = new String[100];

    void addBook(String title, String author) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = title + " by " + author;
                System.out.println("Book added: " + books[i]);
                return;
            }
        }
        System.out.println("Library is full! Cannot add more books.");
    }

    void removeBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].toLowerCase().startsWith(title.toLowerCase() + " by ")) {
                System.out.println("Book removed: " + books[i]);
                books[i] = null;
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void displayBooks() {
        boolean isEmpty = true;
        for (String book : books) {
            if (book != null) {
                System.out.println(book);
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("No books available in the library.");
        }
    }

    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        Scanner scanner = new Scanner(System.in);

        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("To Kill a Mockingbird", "Harper Lee");

        System.out.println("Current library:");
        library.displayBooks();

        System.out.print("Enter a book title to remove: ");
        String titleToRemove = scanner.nextLine();
        library.removeBook(titleToRemove);

        System.out.println("Updated library:");
        library.displayBooks();
    }
}
