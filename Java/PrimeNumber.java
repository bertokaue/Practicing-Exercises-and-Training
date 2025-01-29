import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){ 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your natural number and check out if it is a prime number: ");
        int inputNumber = scanner.nextInt();
        double testNumber;
        boolean primeNumber = true;

        while(inputNumber == 1){ 
            System.out.print("Number 1 is not prime. Try something else: ");
            inputNumber = scanner.nextInt();        
        }
        
        while(divisionNumbers(inputNumber) == true) { 
            System.out.print("OK, we all know that 2, 3, 5 and 7 are primes. Type something else: ");
            inputNumber = scanner.nextInt();
        }

        for( int i = 2; i <= 7; i++ ){
            testNumber = (double) inputNumber / i;           
            if(testNumber == (int) testNumber) { 
                primeNumber = false;
            } }

            if(primeNumber == false) { 
                System.out.println("It is NOT a prime number :)");
            }
            else { 
                System.out.println("It is a prime number :)");
            }        

        scanner.close();

        }
    

    public static boolean divisionNumbers (int inputNumber) { 
        return inputNumber == 2 || inputNumber == 3 || inputNumber == 5 || inputNumber == 7;
    }
}
