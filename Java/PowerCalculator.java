import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("This is a power calculator.");
        System.out.print("Please, fill in the base number: ");
        int base = scanner.nextInt();
        System.out.print("Fill in the exponent: ");
        int exponent = scanner.nextInt();
        System.out.println("Would you like to see the whole counting process? (Yes/No)");
        String yes = scanner.next();
        long result = 1;

        if(yes.equalsIgnoreCase("yes")) { 
        for(int i = 1; i <= exponent; i++) {
        result = result*base;
        System.out.println(base + " * " + (result/base) + " = " + result);
        } 
    }

        else { for(int i = 1; i <= exponent; i++) {
            result = result*base;
        }
        System.out.println(base + " raised to the power of " + exponent + " = " + result);
        }

    scanner.close();
    }
    
}
