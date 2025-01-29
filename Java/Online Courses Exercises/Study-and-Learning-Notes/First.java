import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;

public class First {
    public static void main(String[] args) { 
        int myAge = 30;
        int herAge = myAge;
        System.out.println(herAge);
//PRIMITIVE TYPES

        byte yAge = 30; //From -128 to 127
        long viewsCount = 3_457_132_166L; //Up to 2 billions carachters, use underlines to separarte and make it better visible.
        char letter = 'A'; //Letters, one use '' and more than one ""
        boolean isEligible = false; //True or false 

//REFERENCE TYPES = Store complex options
      Date now = new Date();
      System.out.println(now);

//Memorys might be alocated in different slots with PRIMITIVE TYPES
     byte x = 1;
     byte y = x;
     x = 2;
     System.out.println(y);
//But they also might be referencing the same memory slots on REFERENCE TYPES
     Point point1 = new Point(1, 1);
     Point point2 = point1;
     point1.x = 2;
     System.out.println(point2);

//Shortlines to strings, both works, but you have a quicker way to do it. And some useful tips
    String message1 = new String("Hello World" + "!!");
    String message2 = "Hello world" + "!!";
    System.out.println(message1);
    System.out.println(message2);
    System.out.println(message1.length());
    System.out.println(message2.replace("!", "*"));
    System.out.println(message1.endsWith("!!"));
    System.out.println(message2.endsWith("!!")); //This is true because the System.out.println create another string to show the replaed *.

    String message3 = "     Hello World!!    ";
    System.out.println(message3);
    System.out.println(message3.trim());

    String josh = "Hello \"Josh\""; //You can use the \ to add characters that would be impossible because of syntaxes.
    System.out.println(josh);
    String backslash = "C:\\Windows\\example\\...";
    System.out.println(backslash);

//Arrays
     int[] numbers = new int[5];
     numbers [0] = 1;
     numbers [1] = 2;
     // if we use: numbers [10] = 3; it will pop up an error because our arrays maximus value is set to 5;
     System.out.println(numbers); //This way, it shows us the memory number where the array is located at, we need to update our array into a string.
     System.out.println(Arrays.toString(numbers));

     int[] simpleNumbers = { 3, 2, 5, 4, 1 }; //This way we can get a shorcut creating our array, but it is going to be only the characters we put in.
     System.out.println(simpleNumbers.length);
     System.out.println(Arrays.toString(simpleNumbers));
     Arrays.sort(simpleNumbers); //This array command, organize the numbers in order.
     System.out.println(Arrays.toString(simpleNumbers));

     //We can create 2 and 3 dimensional arrays, as follows:

     int [] [] twoDNumbers = new int [2] [3]; //This is 2 rows and 3 columns.
     twoDNumbers [0] [0] = 1;
     // if we use System.out.println(Arrays.toString(2dNumbers)); it will also gives us an error, so for 2d arrays, we have another command:
     System.out.println(Arrays.deepToString(twoDNumbers));

     int [] [] twoDNumbersSimple = { { 1, 2, 3 }, { 4, 5, 6 } };
     System.out.println(Arrays.deepToString(twoDNumbersSimple));

     int [] [] [] threeDNumbers = new int [2] [3] [5];
     threeDNumbers [0] [0] [0] = 1;
     System.out.println(Arrays.deepToString(threeDNumbers));

     //Java can do maths with signal like +, -, *, /, %.

     int plus = 10 + 3;
     System.out.println(plus);

     int division = 10 / 3;
     System.out.println(division);
     
     double divisionD = (double)10 / (double)3; //If you want the numbers to be decimals, you have to set them to double or float
     System.out.println(divisionD);
     
     int X = 1;
     X += 5; //or x = x + 5; You can use any math commands to change the value to X.
     System.out.println(X);

     // Implicit casting :  This is implicited casting because the values are the same and they can fit in each other if needed, having both 8 bytes.
     // byte > short > int > long > float > double;

     double t = 1.1;
     double r = t + 2;
     System.out.println(r); 

     // Explicit casting.

     //double t = 1.1; is being used from the above.
     int u = (int)t + 2;
     System.out.println(u); //Now we are forcing, expliciting the number to be converted into a smaller size, so the result can fit our needings.

     //Casting can only be done with compatible forms, like we are doing now because they are all numbers. We can't cast a String with a Number, unless:

     //Converting Strings to number:
     //This is important because often when we get information through a survey, an online game, etc. the client will type it into a String, so we need to convert it to be able to use it.
     String q = "1";
     int w = Integer.parseInt(q) + 2;
     System.out.println(w);


     //Math
     int math1 = Math.round(4.6F); //Used to round the numbers.
     System.out.println(math1);
 
     int math2 = (int)Math.ceil(1.1F); //Here we need to force it to give us an int value because that is what we want to get.
     System.out.println(math2); //Ceil gives us the ceiling closest number, the highest closest number.

     int math3 = (int)Math.floor(1.9F); //The opposite of Ceiling, it returns the floor value.
     System.out.println(math3);

     int math4 = Math.max(10, 3); //Straight forward, returns the greater value.
     System.out.println(math4);

     double math5 = Math.random() * 100; //Returns a random value from 0 to 1, so to get the numbers between it, must be in double.
     System.out.println(math5); //Also if we want a random number from 0 to another value, we simply multiply it at the end of the syntax;

     int math6 = (int)Math.round(Math.random() * 100); //Here we used what we've learnt to create a straight random number, using explicit casting, and Math.round.
     System.out.println(math6); //If we use int math6 = (int) Math.random() * 100; the result will always be 0, because the int is just getting the Math.dandom().
     //Another easier way to write it down is int math6 = (int)(Math.random() * 100); and this will work fine.

     //Formating numbers: $1,243.28, 10%, etc.
     NumberFormat currency = NumberFormat.getCurrencyInstance(); //We can not create an instance of it using NumberFormat currency = new NumberFormat(); because NumberFormat is abstract.
     String currencyR = currency.format(1234567.891);
     System.out.println(currencyR);

     // Instead of using the whole expression, NumberFormat percentage = NumberFormat.getPercentInstance(); we can give it a shortcut:
     String percentageR = NumberFormat.getPercentInstance().format(0.1);
     System.out.println(percentageR);

     //Reading Input
     Scanner scanner = new Scanner(System.in);
     System.out.print("Age: ");
     byte age = scanner.nextByte(); //scanner.nextByte(); can be changed for whatever numeric value you want to receive.
     scanner.nextLine(); // Using scanner.nextByte() leaves the cursor at the end, so the first scanner.nextLine() reads a blank line. Add an extra scanner.nextLine() to fix this.
     System.out.println("You are " + age);

     Scanner scannerName = new Scanner(System.in);
     System.out.print("Name: ");
     String name = scannerName.nextLine().trim(); //Here we need scanner.nextLine to get the whole line and return the full name, otherwise it will return only the first name.
     System.out.println("Your name is " + name);








    }
}
