package AT_CLASS.HW.HW_WEEK.Week17.HW;
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String name;
    private String author;
    private String publication;

    public Book(String name, String author, String publication) {
        this.name = name;
        this.author = author;
        this.publication = publication;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;
    }

}

public class MainClass2 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("Introduction to Java", "John Smith", "ABC Publications");
        Book book2 = new Book("Data Structures and Algorithms", "Alice Johnson", "XYZ Books");
        Book book3 = new Book("Java Programming", "Jack Brown", "DEF Press");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        System.out.println(books);
        Scanner scanner = new Scanner(System.in);
        boolean continueSearch = true;

        while (continueSearch) {
            System.out.println("\tSearch here Wer book and it must be at least 3 letter long");
            String search = scanner.nextLine();
            if (search.length() < 3) {
                System.out.println("input must be atleast 3 letter long");
            }else{
                ArrayList<Book> matchlist = new ArrayList<>();
                for(Book book: books){
                    if (book.getAuthor().contains(search) || 
                        book.getName().contains(search) || 
                        book.getPublication().contains(search)){
                        matchlist.add(book);
                    }
                }
                if(matchlist.isEmpty()){
                    System.out.println("No matching books found.");
                }else {
                    System.out.println("\nMatching books: \n");
                    for (Book book : matchlist) {
                        System.out.println("Name: " + book.getName() +"\n"+ "Author: " + book.getAuthor() +"\n"+ "Publication: " + book.getPublication()+"\n");
                    }
                }
            }

            System.out.println("Do We want to continue searching? (yes/no)");
            String choice = scanner.nextLine().trim().toLowerCase();
            if (choice.equals("no")) {
                continueSearch = false;
            }
        }

        System.out.println("Program ended.");
        scanner.close();
    }
}


// Exactly! We've got it.

// Here's a summary of what We described:

// 1. We have three `Book` objects (`book1`, `book2`, and `book3`) created using the `Book` class.

// 2. These `Book` objects are added to an `ArrayList` named `books`.

// 3. We can access each `Book` object stored in the `ArrayList` by its index. For example, `books.get(0)` would give We `book1`, `books.get(1)` would give We `book2`, and so on.

// 4. Once We retrieve a `Book` object from the `ArrayList`, We can use its methods (such as `getAuthor()`, `getName()`, etc.) to access and manipulate the data associated with each book.

// So, We're absolutely correct. We can access each `Book` object in the `ArrayList` and use their methods to work with the data stored in each book object.