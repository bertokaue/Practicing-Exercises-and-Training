import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number and see it in reverse =c= :");
        int inputNumber = scanner.nextInt();
        String stringInput =  String.valueOf(inputNumber);
        
        while(inputNumber<10){ 
            System.out.println("Please, write a number bigger than 10 :");
            inputNumber = scanner.nextInt();
        }

        int reversedNumber = 0;
        int extractedDigit = 0;

        while(inputNumber != 0) { 
            extractedDigit = inputNumber%10 ;
            reversedNumber = extractedDigit + (reversedNumber * 10);
            inputNumber = inputNumber/10;
        }

        String reversedString = String.valueOf(reversedNumber);
        int inputLength = stringInput.length();
        int reversedLength = reversedString.length();

        if(inputLength == reversedLength){
       System.out.println("Reveeeeeersed ==== " + reversedNumber);
        }
        else if (inputLength != reversedLength){
            int difference = inputLength - reversedLength; 
            for(int i = 0; i < difference; i++){ 
            reversedString = "0" + reversedString;
            }
            System.out.println("Reveeeeeersed ==== " + reversedString);
        }

       scanner.close();
        
    }
    
    
}
