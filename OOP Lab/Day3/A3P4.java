class Staff {
    String name;
    String address;

    Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class FullTimeStaff extends Staff {
    String department;
    double salary;

    FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }
}

class PartTimeStaff extends Staff {
    int numberOfHours;
    double ratePerHour;

    PartTimeStaff(String name, String address, int numberOfHours, double ratePerHour) {
        super(name, address);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }
}

public class A3P4 {
    public static void main(String[] args) {
        FullTimeStaff fullTimeStaff = new FullTimeStaff("Soubhik", "Kolaghat", "HR", 50000.0);
        PartTimeStaff partTimeStaff = new PartTimeStaff("Amritendu", "Tamluk", 20, 15.0);

        System.out.println("Full Time Staff Details:");
        System.out.println("Name: " + fullTimeStaff.name);
        System.out.println("Address: " + fullTimeStaff.address);
        System.out.println("Department: " + fullTimeStaff.department);
        System.out.println("Salary: $" + fullTimeStaff.salary);

        System.out.println("\nPart Time Staff Details:");
        System.out.println("Name: " + partTimeStaff.name);
        System.out.println("Address: " + partTimeStaff.address);
        System.out.println("Number of Hours: " + partTimeStaff.numberOfHours);
        System.out.println("Rate per Hour: $" + partTimeStaff.ratePerHour);
    }
}
