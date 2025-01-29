import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number to get the factorial: ");
        int userInput = scanner.nextInt();
        long factorial = userInput;

        System.out.println("Would you like to see the whole counting process? (Yes/No)");
        String yes = scanner.next();        
        if(yes.equalsIgnoreCase("yes")) {
            for(int i = 1; i < userInput; i++){
                factorial = factorial * i;
                System.out.println("*" + i + " = " + factorial);      
        } 
        System.out.println("The factorial(!) of " + userInput + " is: " + factorial);  
    }
        else { 
        for(int i = 1; i < userInput; i++){
             factorial = factorial * i;       
        }
        System.out.println("The factorial(!) of " + userInput + " is: " + factorial);
    }
    scanner.close();
    }
}