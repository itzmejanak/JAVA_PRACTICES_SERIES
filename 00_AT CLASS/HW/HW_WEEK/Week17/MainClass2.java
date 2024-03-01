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

        books.add(new Book("Introduction to Java", "John Smith", "ABC Publications"));
        books.add(new Book("Data Structures and Algorithms", "Alice Johnson", "XYZ Books"));
        books.add(new Book("Java Programming", "Jack Brown", "DEF Press"));

        Scanner scanner = new Scanner(System.in);
        boolean continueSearch = true;

        while (continueSearch) {
            System.out.println("\tSearch here your book and it must be at least 3 letter long");
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

            System.out.println("Do you want to continue searching? (yes/no)");
            String choice = scanner.nextLine().trim().toLowerCase();
            if (choice.equals("no")) {
                continueSearch = false;
            }
        }

        System.out.println("Program ended.");
        scanner.close();
    }
}
