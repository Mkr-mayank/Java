class Employee {
    int employeeId;
    String name;
    String dateOfBirth;
    String designation;
    double basicSalary;

    Employee(int employeeId, String name, String dateOfBirth, String designation, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }

    double calculateNetSalary() {
        double hra = 0.2 * basicSalary;
        double da = 0.7 * basicSalary;
        return basicSalary + hra + da;
    }

    void printData() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Net Salary: $" + calculateNetSalary());
    }
}

class A3P1 {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Ramprashad", "1965-11-05", "Software Engineer", 400000.0);
        employee.printData();
    }
}

