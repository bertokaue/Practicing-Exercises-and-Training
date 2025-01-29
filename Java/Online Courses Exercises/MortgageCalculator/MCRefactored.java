import java.text.NumberFormat;
import java.util.Scanner;

public class MCRefactored {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        int principalValue = (int) readNumber(scanner, "Principal ($1K - $1M): " , 1000, 1_000_000);
        float annualInterestRate = (float) readNumber(scanner, "Annual Interest Rate: ", 1, 30);
        byte yearlyPeriod = (byte) readNumber(scanner, "Period (Years): ", 0, 50);          
        
        double mortgageValue = calculateMortgage(principalValue, annualInterestRate, yearlyPeriod);

        String mortgageValueString = NumberFormat.getCurrencyInstance().format(mortgageValue);
        System.out.println("Mortgage: " + mortgageValueString);
        scanner.close();

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

            final byte monthsInYear = 12;
            final byte percent = 100; 

            short numberOfPayments = (short)(yearlyPeriod * monthsInYear);
            float monthlyInterest = annualInterestRate / monthsInYear / percent;
            double mortgageValue = principalValue * ((monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments)) / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1));
            return mortgageValue;

    }
}
