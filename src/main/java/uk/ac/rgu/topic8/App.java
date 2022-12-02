package uk.ac.rgu.topic8;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args){

        /* Use the Scanner class to get user input at the console */
        Scanner input = new Scanner(System.in);

        /* Use System.out.print (not println) to put the prompt on the same line as the input */
        System.out.print("Enter a number: ");
        String text = input.nextLine();

        input.close();

        try{
            /* Try to convert the input to an int - if this fails, an exception is thrown */
            int number = Integer.valueOf(text);
            int result = number * 10;

            System.out.println("Input x10 = " + result);
        }catch(NumberFormatException ex){
            System.out.println("That's not a number");
        }
    }




}
