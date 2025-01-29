import java.util.Scanner;

public class HCFCalculator {

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in the first number: ");
        int inputNumberOne = scanner.nextInt();
        System.out.print("Type in the second number: ");
        int inputNumberTwo = scanner.nextInt();
        int result;
        int hcf = 0;

        do{ 
            result = inputNumberOne % inputNumberTwo;

            if(result == 0) { 
                hcf = inputNumberTwo;
                break;
            }
            else { 
                inputNumberOne = inputNumberTwo;
                inputNumberTwo = result;
            }

            System.out.println(result);
        } while(result != 0);

        System.out.println("HCF = " + hcf);

        scanner.close();

    }}