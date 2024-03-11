package AT_CLASS.CW.$03_Basics;
public class Nov23
{
    public static void main() {  
    int a;
    a=10;
       System.out.println("a+1 is ="+ (a+1));
       System.out.println("a is ="+ a);
       System.out.println("a = a+1 is ="+ (a+1));
       System.out.println("a is ="+ a);
       nov21();
       nov24();
       nov25();
       }
       
    public static void nov21(){
        int a=10;
      System.out.println("MORE CONCEPT ABOUT a++ ,a--, ++a, --a");
       
       // A++,  .. A--, ++A,...--A, CONCEPT
       System.out.println("a++ is ="+ (a++));
       System.out.println("++a is ="+ (++a));
       System.out.println("a-- is ="+ (a--));
       System.out.println("--a is ="+ (--a));    
    }

    public static void nov24(){
     System.out.println("BASIC FOR LOOP");
       for(int i = 0; i<10; i++){
           System.out.println(i);
       }
    }
    
    public static void nov25(){
     System.out.println("BASIC FOR CONDITIONNAL IF EALSE");
      int b;
      b = 17;
     if(b>17){
     System.out.println("B IS GREATER THAN THE "+b);
    }else if(b==17){
        System.out.println("B IS equal TO THE "+b);
    }
    else{
        System.out.println("B IS less THAN THE "+b);
    }
}
}

