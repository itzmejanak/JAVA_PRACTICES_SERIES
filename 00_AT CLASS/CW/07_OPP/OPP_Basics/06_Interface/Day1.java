package Interface;

interface Printable{
        public void print();
}
public class Day1 implements Printable {
    public  void print(){
        System.out.println("I am printed");
    }
}