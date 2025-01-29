public class Second {
    public static void main(String[] args) { 

        //Comparison operators

        int x = 1;
        int y = 1;
            System.out.println(x == y); //This is the equality operator, giving back in boolean if the values are equal (true) or not (false)
            System.out.println(x != y); //If the value is different than
            System.out.println(x > y); //If the value is bigger than
            System.out.println(x <= y); //If the value is smaller or equal to

        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; // && refers to "and", so you can add more operations. Both of these conditions must be true, to get a true result.
            System.out.println(isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean isEligible = hasHighIncome || hasGoodCredit; // Now, || is the signal to "or", if ate least one condition is true, the result will be true.
            System.out.println(isEligible);
        boolean hasCriminalRecord = false;
        boolean isEligible2 = hasHighIncome || hasGoodCredit && !hasCriminalRecord; //The "not" signal is !, it reverts the entry condition
        // So if the person doesn't have a criminal record, it will change the false to true, and bring up the answer as True, he is eligible.
            System.out.println(isEligible2);

        //If statements
        int temp = 8;
        if (temp > 30) { //If you have multiple statements (sout), use braces to keep them together
            System.out.println("It's a hot day");
            System.out.println("Drink water!");
        } 
        else if (temp > 20) //It can be used as "(temp > 20 && temp <=30)" but for the sake of simplifying, we did it shorter (as we already have the condition on the first if)
            System.out.println("It's a beautiful day");
        else 
            System.out.println("Cold day");
            
        //int income = 120_000;
        //boolean hasHighIncome2;
        //if (income > 100_000) 
        //  hasHighIncome2 = true;
        //else 
        //  hasHighIncome2 = false;
        //We can simplify all this expression by just doing this:

        int income = 120_000;
        boolean hasHighIncome2 = (income > 100_000); // Here we don't actually need the (), but it makes the code more readable
            System.out.println(hasHighIncome2);

        //Another good simplification is:
        //int income = 120_000;
        //String className;
        //if (income > 100_000) 
        // className = "First"
        //else 
        // className = "Economy";

        //int Income = 120_000;
        String className = (income > 100_000) ? "First" : "Economy"; //Ternary operator
        System.out.println(className);
        //So here we have a condition "income > 100_000", followed by a true and false statement, chaging the string to a conditional boolean value.

        String role = "admin"; //Here instead of using multiple If's, we can use "switch" to check which condition is true and give back the respective value.

        switch (role) { 
            case "admin":
            System.out.println("You're an Admin");
            break;

            case "moderator":
            System.out.println("You're a Moderator");
            break;

            default:
            System.out.println("You're a guest");
        }





    }
    
}
