import java.util.Scanner;

public class FizzBuzz {

    public static void main (String[] args) { 
        //IF ITS DIVISIBLE BY 5, WE GET FIZZ; IF DIVISIBLE BY 3, WE GET BUZZ. IF BY BOTH, WE GET FIZZBUZZ AND IF NONE, REPEAT THE NUMBER.

        Scanner scanner = new Scanner(System.in);
           System.out.print("Number:");
           int number = scanner.nextInt();

           boolean buzz = (number % 3 == 0);
           boolean fizz = (number % 5 == 0);
           

           if (buzz && fizz)
            System.out.println("FizzBuzz");
        else if (buzz)
            System.out.println("Buzz");
        else if (fizz)
            System.out.println("Fizz");
        else
            System.out.println(number);

            scanner.close();
            }              
           
           }
    

