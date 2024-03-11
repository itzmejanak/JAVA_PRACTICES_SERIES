public class loopssss
{
    public static void main(String[] args){
        
    for(int i = 1; i<10; i++){
      System.out.println(i);
    }
    
    System.out.println("\n");
    
    for (int i = 0; i <= 10; i++) {
        
        if(i % 2 == 0){
        continue;
        }
      System.out.print(i + " ");
    }
    
    System.out.println("\n");

for (int i = 1; i <= 10; i++) {
        
        if(i % 2 == 1){
        continue;
        }
      System.out.print(i + " ");
    }
}
  
    static void pattenz(){
      
      int n = 4;
    for (int i = 1; i <= n; i++) {
            // Print spaces
    for (int j = n - i; j > 0; j--) {
      System.out.print(" ");
    }

   // Print stars
   for (int k = 1; k <= i; k++) {
      System.out.print(" *");
   }
     // Move to the next line after each row
     System.out.println();
    }
    

}
     static void patten2(){
     for(int i = 4; i >= 1; --i) {  //For Loop for Row 
     for(int j = 1; j <= i; ++j) { //For Loop for Col
        System.out.print("⭐ "); //Prints *
        }
     System.out.println(); //Get to newline
        }
}


    //for rectangel
static void patten4(){
     int n =5;
     for(int i =1; i<=n; i++) {  //For Loop for Row 
     for(int j = 1; j <= 5; ++j) { //For Loop for Col
        System.out.print("⭐ "); //Prints *
        }
     System.out.println(); //Get to newline
        }

    }
    
    
    //trangle l shape
static void patten5(){
     int n =5;
     for(int i =1; i<=n; i++) {  //For Loop for Row 
     for(int j = 1; j <= i; ++j) { //For Loop for Col
        System.out.print("⭐ "); //Prints *
        }
     System.out.println(); //Get to newline
        }

    }
    
    //down l shape trangel
static void patten6(){
     int n = 5;
     for(int i =1; i<=n; i++) {  //For Loop for Row
         
     for(int j = i; j <= n; ++j) { //For Loop for Col
        System.out.print("⭐ "); //Prints *
        }
        
     System.out.println(); //Get to newline
        }

    }
    
    
    //
}