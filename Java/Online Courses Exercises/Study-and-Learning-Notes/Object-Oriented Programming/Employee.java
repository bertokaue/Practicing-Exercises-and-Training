

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    //public int extraHours;

    public int calculateWage(int extraHours) {  //We don't need the STATIC here because we just use it when we need to call this method from another method
    //Also, as the extraHours are always different, we don't want it to be in the Employee class, so we can change it accordingly every month!
        return baseSalary + (hourlyRate * extraHours);

}

public void setBaseSalary(int baseSalary) { 
    if(baseSalary <=0)
    throw new IllegalArgumentException("Salary can not be 0 or less.");
    this.baseSalary = baseSalary;
}
    
public int getBaseSalary() {
        return baseSalary;
    }

public void setHourlyRate(int hourlyRate) { 
    if(hourlyRate <= 0)
    throw new IllegalArgumentException("Hourly rate can not be 0 or less.");
    this.hourlyRate = hourlyRate;
}

public int getHourlyRate() { 
    return hourlyRate;
}

}
