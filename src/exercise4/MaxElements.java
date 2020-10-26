package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement{
  public static void main (String []args){
    Scanner input = new Scanner (System.in);
    
    int Größe = input.nextInt();
    double [] zahlen = new double [Größe];

    
    System.out.println("Geben Sie Zahlen ein: ");
    for (int i = 0; i<zahlen.length; i++){
      zahlen[i] = input.nextDouble();
    }
    double max=zahlen[0];

    for(int i = 1; i<zahlen.length; index++){
      
      if (max < zahlen[i]){
        max = zahlen[i;
      }

      
    }


      System.out.println("Max number: " + max);

    }


    

  }