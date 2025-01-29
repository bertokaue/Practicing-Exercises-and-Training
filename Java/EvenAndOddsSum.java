import java.util.Scanner;

public class EvenAndOddsSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your number, and see the sum of the even and odds: ");
        int inputNumber = scanner.nextInt();

        String inputString = String.valueOf(inputNumber);

        System.out.println("Do you want to see the whole counting process? (Yes/No)");
        String yesOrNo = scanner.next();
        System.out.println();

        if(yesOrNo.equalsIgnoreCase("no")) {
        System.out.println("Result of Even Values = " + evenFinal(inputString, yesOrNo));
        System.out.println("Result of Odd Values = " + oddFinal(inputString, yesOrNo));
    } else if(yesOrNo.equalsIgnoreCase("yes")) {
        System.out.println("Result of the Even Numbers =  " + evenFinal(inputString, yesOrNo));
        System.out.println();
        System.out.println("Result of the Odd Numbers = " + oddFinal(inputString, yesOrNo));
    }

    scanner.close();
   
    }       
        
    public static int evenFinal(String inputString, String yesOrNo){
        
        char char2 = '2';      
        char char4 = '4';       
        char char6 = '6';       
        char char8 = '8';
        int inputCount = 0;
       


        for(int i = 0; i < inputString.length(); i++) { 
            if(inputString.charAt(i) == char2){
                inputCount++;  } }
        int char2Result = inputCount * 2; 
        if(yesOrNo.equalsIgnoreCase("yes")) {         
        System.out.println(inputCount + " * 2 = " + char2Result); }
            inputCount = 0;  

    
        for(int i = 0; i < inputString.length(); i++) { 
            if(inputString.charAt(i) == char4){
                inputCount++;   } }
        int char4Result = inputCount * 4; 
        if(yesOrNo.equalsIgnoreCase("yes")) {             
        System.out.println(inputCount + " * 4 = " + char4Result); }
            inputCount = 0;   

    
        for(int i = 0; i < inputString.length(); i++) { 
            if(inputString.charAt(i) == char6){
                inputCount++;   } }
        int char6Result = inputCount * 6;
        if(yesOrNo.equalsIgnoreCase("yes")) {              
        System.out.println(inputCount + " * 6 = " + char6Result); }
            inputCount = 0;    

    
        for(int i = 0; i < inputString.length(); i++) { 
            if(inputString.charAt(i) == char8){
                inputCount++;   } }
        int char8Result = inputCount * 8;
        if(yesOrNo.equalsIgnoreCase("yes")) {              
        System.out.println(inputCount + " * 8 = " + char8Result); } 
            inputCount = 0;
    
        int evenResult = char2Result + char4Result + char6Result + char8Result;   
        return evenResult;
        

    }


    public static int oddFinal(String inputString, String yesOrNo) {

        int oddResult = 0;
        char char1 = '1';
        char char3 = '3';
        char char5 = '5';
        char char7 = '7';
        char char9 = '9';
        int inputCount = 0;

        

        for(int i = 0; i < inputString.length(); i++) { 
            if(inputString.charAt(i) == char1){
                inputCount++;    } }
                int char1Result = inputCount * 1;
        if(yesOrNo.equalsIgnoreCase("yes")) {  
        System.out.println(inputCount + " * 1 = " + char1Result); }
            inputCount = 0; 

    
        for(int i = 0; i < inputString.length(); i++) { 
            if(inputString.charAt(i) == char3){
                inputCount++;   } }
        int char3Result = inputCount * 3;
        if(yesOrNo.equalsIgnoreCase("yes")) {              
        System.out.println(inputCount + " * 3 = " + char3Result); }
                inputCount = 0;  

    
        for(int i = 0; i < inputString.length(); i++) { 
            if(inputString.charAt(i) == char5){
                inputCount++;   } }
        int char5Result = inputCount * 5;
        if(yesOrNo.equalsIgnoreCase("yes")) {           
        System.out.println(inputCount + " * 5 = " + char5Result); }
                inputCount = 0;    

    
        for(int i = 0; i < inputString.length(); i++) { 
            if(inputString.charAt(i) == char7){
                inputCount++;   } }
        int char7Result = inputCount * 7;
        if(yesOrNo.equalsIgnoreCase("yes")) {           
        System.out.println(inputCount + " * 7 = " + char7Result); }
                inputCount = 0;   

    
        for(int i = 0; i < inputString.length(); i++) { 
            if(inputString.charAt(i) == char9){
                inputCount++;   } }
        int char9Result = inputCount * 9;  
        if(yesOrNo.equalsIgnoreCase("yes")) {            
        System.out.println(inputCount + " * 9 = " + char9Result); }
                inputCount = 0;   


        oddResult = char1Result + char3Result + char5Result + char7Result + char9Result;        
        return oddResult;

    }
}
