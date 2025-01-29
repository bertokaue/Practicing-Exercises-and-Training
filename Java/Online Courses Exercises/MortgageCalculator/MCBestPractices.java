import java.util.Scanner;
import java.text.NumberFormat;

public class MCBestPractices {
    
        public static void main(String[] args) { 
            final byte MONTHS_IN_YEAR = 12;
            final byte PERCENT = 100;
            

            Scanner scanner = new Scanner(System.in);

            System.out.print("Principal: ");
            int principalValue = scanner.nextInt();

            System.out.print("Annual Interest Rate: ");
            float annualInterestRate = scanner.nextFloat();
            float monthlyInterest = annualInterestRate / MONTHS_IN_YEAR / PERCENT;

            System.out.print("Period (Years): ");
            byte yearsPeriod = scanner.nextByte();
            int monthlyPeriod = yearsPeriod * MONTHS_IN_YEAR;
            

            double mortgageValue = principalValue * ((monthlyInterest * Math.pow((1 + monthlyInterest), monthlyPeriod)) / (Math.pow((1 + monthlyInterest), monthlyPeriod) - 1));
            
            String mortgageValueFormatted = NumberFormat.getCurrencyInstance().format(mortgageValue);
            System.out.print("Mortgage: " + mortgageValueFormatted);

            scanner.close();
            

        }
}
