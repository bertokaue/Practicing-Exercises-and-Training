import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome the your infinite sum loop.");        
        String yesOrNo;

        do{ 
            System.out.print("Type your first number: ");
                int firstInput = scanner.nextInt();
            System.out.print("Type your second number: ");
                int secondInput = scanner.nextInt();
                int result = firstInput + secondInput;

            
            System.out.println();
            System.out.println("The sum is: " + result);
            System.out.println();

            System.out.print("Would you like to do another sum? (Yes/No): ");
            scanner.nextLine();
            yesOrNo = scanner.next(); 
            while(!yesOrNo.equalsIgnoreCase("yes") && !yesOrNo.equalsIgnoreCase("no")){ 
                System.out.println("Please, type Yes or No: ");
                yesOrNo = scanner.next();
            }

        } while(yesOrNo.equalsIgnoreCase("yes"));
        
        System.out.println();
        System.out.println("Thank you for using it! :)");
        
        scanner.close();

    }

}


