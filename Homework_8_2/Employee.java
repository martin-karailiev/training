package Homework_8_2;

public class Employee {
    public static String firstName, lastName;
    public static int id;
    public static int raise;
    public static double salary;

    public static double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static String getName() {
        return firstName + " " + lastName;
    }
    public static double getAnnualSalary() {
        return salary*12;

    }
public static double raiseSalary() {
    return getSalary() * raise / 100;
}

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
