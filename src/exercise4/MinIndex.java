package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int Grosse = input.nextInt();
    double [] elemente = new double[Grosse];

    System.out.println("Geben Sie Zahlen ein: ");

    for(int i = 0; i<elemente.length; i++){
      elemente[i] = input.nextDouble();

    }
    int min = 0;

    double mine l = elemente[0] ;

    for(int i = 1; i<elemente.length; i++){
      if (mine l > elemente[i]){
        mine l = elemente[i];
        min = i;
      }
    }







    System.out.println("Min i: " + min);
  }
}