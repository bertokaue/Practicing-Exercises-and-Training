import java.util.Scanner;

public class Third {

    public static void main(String[] args) {

        //Loops creation, to repeat statements

        for (int i = 1; i <= 5; i++) //We usually use letters i, j and k for loops. Second statement is a boolean value.
        System.out.println("Hello World " + i); //With the statement deeloped this way, we can easily count it to see the numbers. 
        //We can also decrement the values, using for (int i = 5; i > 0; i--)

        int j = 0;
        while (j < 3) { 
            System.out.println("Hello Wooorld " + j);
            j++;
        }  //This is how we write down a while loop.
        //For loops are better when we know how many loops we want, and while are better when we dont know how many loops we want.
        //Ex.: Keep looping unitl the user type "Quit". We dont know how many times it is going to take, so its better to use while

        String input = "";
        Scanner scanner = new Scanner(System.in); //To do not polute our memory, its better to use the Scanner outside the while loop, otherway it will create a scanner every time it runs
        while (!input.equals("quit")) { //While input is NOT equal to "quit"
        System.out.print("Input 1: ");
        input = scanner.next().toLowerCase(); //Here if the user types "quit" in UpperCase or mixed, the system will not understand, so we add .toLowerCase in the scanner
        System.out.println(input); 
    } 

do { //do while loops are made to be executed at least once, since the statements come before the user answer / input. We don't use it often, but its good to know.
    System.out.print("Input 2: ");
    input = scanner.next().toLowerCase(); 
    System.out.println(input);
} while (!input.equals("quit")); 


        while(true) { 
            System.out.print("Input 3: ");
            input = scanner.next().toLowerCase();
            if (input.equals("yes"))
            continue;
            if (input.equals("stop"))
            break;
            System.out.println(input);
        }

        //for each statement:
        String[] fruits = { "Apple", "Orange", "Mango" };

        for (int k = fruits.length - 1; k >= 0; k--)
        System.out.println(fruits[k]); //This way is more flexible, and you can choose to print it straight forward or reverse

        for (String fruit : fruits)
        System.out.println(fruit); //This way its more simple but more limited, only prints straight forward

        scanner.close();

    }
}
