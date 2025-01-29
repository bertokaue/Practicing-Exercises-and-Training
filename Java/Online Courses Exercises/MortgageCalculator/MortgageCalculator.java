import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalculator {
    
        public static void main(String[] args) {             

            Scanner principalScanner = new Scanner(System.in);
            System.out.print("Principal: ");
            long principal = principalScanner.nextLong();

            Scanner airScanner = new Scanner(System.in);
            System.out.print("Annual Interest Rate: ");
            double air = airScanner.nextDouble();

            Scanner periodScanner = new Scanner(System.in);
            System.out.print("Period (Years): ");
            double period = periodScanner.nextDouble();
            
            double airf = air / 100; 
            double mir = airf / 12;
            double periodM = period * 12;
            

            double monthlyP = principal * ((mir * Math.pow((1 + mir), periodM)) / (Math.pow((1 + mir), periodM) - 1));
            
            String mortgage = NumberFormat.getCurrencyInstance().format(monthlyP);
            System.out.print("Mortgage: " + mortgage);  
            principalScanner.close();
            airScanner.close();    
            periodScanner.close();          
            
            
    }
}
