import java.text.NumberFormat;
import java.util.Scanner;

public class LMCBestPractices { 
    public static void main (String[] args) { 
        final byte monthsInYear = 12;
        final byte percent = 100; 

        int principalValue = 0;
        float monthlyInterest = 0;
        int monthlyPeriod = 0;


        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.print("Principal ($1K - $1M): ");
            principalValue = scanner.nextInt();
            if (principalValue >= 1000 && principalValue <= 1_000_000)
            break; 
        System.out.println("Enter a number between $1,000 and $1,000,000.");
        }
        
        while (true) { 
        System.out.print("Annual Interest Rate: ");        
            float annualInterestRate = scanner.nextFloat();
            if (annualInterestRate > 0 && annualInterestRate <= 30) { 
                monthlyInterest = annualInterestRate / monthsInYear / percent;
                break; 
            }
        System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }


        while (true) {
        System.out.print("Period (Years): ");
            byte yearlyPeriod = scanner.nextByte();
            if (yearlyPeriod >= 1 && yearlyPeriod <=50) { 
                monthlyPeriod = yearlyPeriod * monthsInYear;
                break;
            }
        System.out.println("Enter a period between 1 and 50.");
        }

        
        double mortgageValue = principalValue * ((monthlyInterest * Math.pow((1 + monthlyInterest), monthlyPeriod)) / (Math.pow((1 + monthlyInterest), monthlyPeriod) - 1));


        String mortgageValueString = NumberFormat.getCurrencyInstance().format(mortgageValue);
        System.out.println(mortgageValueString);

        scanner.close();
    }

}