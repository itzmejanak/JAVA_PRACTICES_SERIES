package AT_CLASS.CW.$05_Basics;
import java.util.Scanner;

public class NestedIfElseExample {

    public static void main(String[] args) {
        nestedIfElse();
    }

    static void p(String s) {
        System.out.println(s);
    }

    static void nestedIfElse() {
        Scanner input = new Scanner(System.in);
        p("1st condition");
        String one = input.nextLine();
        Scanner input0 = new Scanner(System.in);
        p("second condition");
        String two = input0.nextLine();

        if (one.equals("rain")) {
            if (two.equals("busy")) {
                p("CoFFee");
            } else {
                p("POAKUDA");
            }

        } else if (one.equals("sunny") || one.equals("cloudy")){
          if (two.equals("busy")) {
            p("ice-cream");
            }else{
            p("stay indoor");
            }
        } else {
            p("bye bye");
        }
    }
}
