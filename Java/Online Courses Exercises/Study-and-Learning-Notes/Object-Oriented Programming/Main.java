public class Main {

    public static void main(String args[]) { 
        var Employee = new Employee();
        Employee.setBaseSalary(50_000);
        Employee.getBaseSalary();
        Employee.setHourlyRate(20);
        Employee.getHourlyRate();
        int wage = Employee.calculateWage(10);
        System.out.println(wage);
    } 
}