/*Find Square*/
package square;

import java.util.*;

public class main {
    

     public static void main(String[] args) {
        
         for (int i = 0; i < 2 ; i++ ){
         Scanner scanner = new Scanner(System.in);
         Square a ;
         a = new Square();
         
         System.out.println("Square1");
         System.out.print("Enter Width : ");
         
         a.width = scanner.nextInt();
         a.result = (int) Math.pow(a.width, 2);
         System.out.println("Area = " + a.result);
         System.out.println("=================");
         }
     }
    
}
//a.width * a.height