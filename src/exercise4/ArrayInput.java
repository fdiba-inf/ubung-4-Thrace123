package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput{
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out.println ("Geben Sie Größe ein: ");
    int a = input.nextInt();
    System.out.println ("Geben Sie Zahlen ein: ");
    int [] numbers = new int[a];
    
    
    for(int i = 0; i<numbers.length; index++){
      numbers[i] = input.nextInt();
      
    }
    
     String numbersAsString = Arrays.toString(numbers);
     System.out.println("Numbers: " + numbersAsString);
    }
  
}
      
  


    