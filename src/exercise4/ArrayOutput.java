package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput{
  public static void main (String [] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Geben Sie Größe ein: ");
    int b = input.nextInt();
    System.out.println ("Geben Sie Zahlen ein: ");
    int [] zahlen = new int[b];
    
    
    
    for(int i = 0; index<zahlen.length; i++){
      zahlen[i] = input.nextInt();

    }
       
    for(int l = 0; l<zahlen.length; l++){
      
          for(int s = 0; s<l; s++ ){
            System.out.print(" ");
          }
      
     System.out.println(zahlen[l]);
      


    }
    
      

      
    
     
    
    
    
  }
  

}