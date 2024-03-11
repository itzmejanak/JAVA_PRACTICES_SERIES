package AT_CLASS.CW.$06_Basics;
import java.util.Scanner;
public class Loops
{
    public static void main(String[] args){
        
    
    for(int i = 1; i<=5; i++){
      System.out.println("janak");
    }
    
    
}

static void whilel(){
    Scanner scanner = new Scanner(System.in);
    String name = "";
    while(name.isBlank()){
         System.out.println("what is your name");
         name = scanner.nextLine();
    }
    System.out.println("HELLO :"+ name);
}

static void dowhle(){
   int a = 11;
  
    do{
    System.out.println("Your number is"+ a);
    a++;
    }while(a<1);
}

static void forl(){                           //to print rectangle
for(int i = 1; i <=2; i++){
          for(int j = 1; j <=4; j++){
          System.out.print("*");
    
    }
    System.out.println();
    }
}


static void trangle(){                       // to print trangle
    
   for(int i = 1; i <=150; i++){
          for(int j = 1; j <= i; j++){
          System.out.print("*");
    
    }
          System.out.println();
    }
}
}

