package AT_CLASS.CW.$02_Basics;
import java.util.Scanner;

public class BooleanIFelse_Nov30 {

    public static void main(String[] args) {
        Boolean();
    }

    static void p(String s) {
        System.out.println(s);
    }

    static void Boolean() {
        Scanner input0 = new Scanner(System.in);
        p("Enter weather condition (rain, sunny, cloudy): ");
        String one = input0.nextLine();

        p("Enter second condition (busy): ");
        String two = input0.nextLine();

        if (one.equals("rain")) {
            if (two.equals("busy")) {
                p("Coffee");
            } else {
                p("POAKUDA");
            }

        } else if (one.equals("sunny") || one.equals("cloudy")) {
            if (two.equals("busy")) {
                p("Ice-cream");
            } else {
                p("Stay indoor");
            }
        } else {
            p("Bye bye");
        }
    }
}
