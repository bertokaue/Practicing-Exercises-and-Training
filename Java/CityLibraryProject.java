package AITProjects;
import java.time.LocalDate;
import java.util.Scanner;

public class CityLibraryProject { 

public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    LocalDate date = LocalDate.now();
    LocalDate takeBookBack = date.plusDays(7);
    String name = "";
    int bookId = 0;

    System.out.println("Welcome to the City Library System!");
    System.out.print("Would you like to create a new Register? (Yes/No): ");
    String register = scanner.next();

    while(!register.equalsIgnoreCase("yes") && !register.equalsIgnoreCase("no")) {
        System.out.println("Please, type in Yes or No!");
        System.out.print("Would you like to create a new Register? (Yes/No): ");
        register = scanner.next();
    }

    if(register.equalsIgnoreCase("yes")){ 
        System.out.print("Full name: ");
        name = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Adress: ");
        String address = scanner.next();

        System.out.print("Phone Number: ");
        String phone = scanner.next();

        System.out.print("Book ID: ");
        bookId = scanner.nextInt();        
    }

    else if(register.equalsIgnoreCase("no")){ 
        System.out.print("Full name: ");
        name = scanner.next();
    
        System.out.print("Book ID: ");    
        bookId = scanner.nextInt(); 
    }
    

    System.out.println("Thank you for borrowing from us!");
    System.out.println(name + ", you should take the book " + bookId + " back on " + takeBookBack );

    scanner.close();
    }
}