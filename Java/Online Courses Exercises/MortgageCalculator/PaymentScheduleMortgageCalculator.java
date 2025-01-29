import java.text.NumberFormat;
import java.util.Scanner;

public class PaymentScheduleMortgageCalculator { 
            final static byte monthsInYear = 12;
            final static byte percent = 100; 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        int principalValue = (int) readNumber(scanner, "Principal ($1K - $1M): " , 1000, 1_000_000);
        float annualInterestRate = (float) readNumber(scanner, "Annual Interest Rate: ", 1, 30);
        byte yearlyPeriod = (byte) readNumber(scanner, "Period (Years): ", 0, 50);        
        
        double mortgageValue = calculateMortgage(principalValue, annualInterestRate, yearlyPeriod);

        scanner.close();

        String mortgageValueString = NumberFormat.getCurrencyInstance().format(mortgageValue);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageValueString);

        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        //AN INDEX TO THE FORMULA COMES HERE
        String stringPrincipalValue = NumberFormat.getCurrencyInstance().format(principalValue);
        System.out.println("Total Loan: " + stringPrincipalValue);
        for(int month = 1; month <= yearlyPeriod * monthsInYear; month++){ 
        double balance = calculateBalance(principalValue, annualInterestRate, yearlyPeriod, month);
        String stringBalance = NumberFormat.getCurrencyInstance().format(balance);
        System.out.println(stringBalance);
        
        }
           
    }

    public static double readNumber(Scanner scanner,String prompt, double min, double max) { 
        double value;
        while (true) { 
            System.out.print(prompt);        
                value = scanner.nextFloat();
                if (value >= min && value <= max)                
                    break; 
            System.out.println("Enter a value between " + (int)min + " and " + (int)max);
            }
            return value; 
    }
    


    public static double calculateMortgage(
        int principalValue, 
        float annualInterestRate, 
        byte yearlyPeriod) {

            int numberOfPayments = (int)(yearlyPeriod * monthsInYear);
            float monthlyInterest = annualInterestRate / monthsInYear / percent;
            double mortgageValue = principalValue * ((monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments)) / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1));
            return mortgageValue;
    }
   
    public static double calculateBalance(
        int principalValue, 
        float annualInterestRate, 
        byte yearlyPeriod,
        int numberOfPaymentsMade
    ) {
            int numberOfPayments = (int)(yearlyPeriod * monthsInYear);
            float monthlyInterest = annualInterestRate / monthsInYear / percent;
                        
            double balance = principalValue *
               (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
             / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
            return balance;
    } 

} 

           

    

