import java.text.NumberFormat;
import java.util.Scanner;

public class LoopMortgageCalculator { 
    public static void main (String[] args) { 
        final byte monthsInYear = 12;
        final byte percent = 100; 


        Scanner scanner = new Scanner(System.in);


        System.out.print("Principal ($1K - $1M): ");
        int principalValue;
        while (true) { 
            principalValue = scanner.nextInt();
            if (principalValue >= 1000 && principalValue <= 1000000)
            break;
            else { 
                System.out.println("Enter a number between $1,000 and $1,000,000.");
            }
        }


        System.out.print("Annual Interest Rate: ");
        float annualInterestRate;

        while (true) { 
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate > 0 && annualInterestRate <= 30)
            break;
            else { 
                System.out.println("Enter a value greater than 0 and less than or equal to 30.");
            }            
        }

            float monthlyInterest = annualInterestRate / monthsInYear / percent;


        System.out.print("Period (Years): ");
        byte yearlyPeriod;

        while (true) { 
            yearlyPeriod = scanner.nextByte();
            if (yearlyPeriod >= 1 && yearlyPeriod <=50)
            break;
            else { 
                System.out.println("Enter a period between 1 and 50.");
            }
        }

        int monthlyPeriod = yearlyPeriod * monthsInYear;

        
        double mortgageValue = principalValue * ((monthlyInterest * Math.pow((1 + monthlyInterest), monthlyPeriod)) / (Math.pow((1 + monthlyInterest), monthlyPeriod) - 1));


        String mortgageValueString = NumberFormat.getCurrencyInstance().format(mortgageValue);
        System.out.println(mortgageValueString);

        scanner.close();
    }

}