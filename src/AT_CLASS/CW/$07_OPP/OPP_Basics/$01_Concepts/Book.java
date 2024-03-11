package AT_CLASS.CW.$07_OPP.OPP_Basics.$01_Concepts;
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
  
   String title;
   String author;
   int pubicationYear;
   
   public Book(){
    this.title = "munaMdan";
    this.author = "laxmi prasad Devkota";
    this.pubicationYear = 1999;  
    }
    
    //action
    public void info(){
    System.out.println("A "+title +","+author+", "+pubicationYear);                     //"title: " + title +"\n"+ "Author: "+ author + "\n"+"publication Year: "+pubicationYear
    System.out.println("\n");
    }
    public static void main(String[] args){
    Book book1 = new Book();
    book1.info();
    }
}
