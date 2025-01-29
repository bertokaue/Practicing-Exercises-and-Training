public class ProceduralProgramming { //This is NOT OOP, and this is the base to compare the difference about the improvements of OOP.

    public static void main(String args[]) { 
        
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);
    }

    public static int calculateWage(
        int baseSalary,
        int extraHours,
        int hourlyRate
    ) {
        return baseSalary + (extraHours * hourlyRate);
    }
    
}
