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

// public class StaffDemo {
//     public static void main(String[] args) {
//         FullTimeStaff fullTimeStaff = new FullTimeStaff("John", "123 Main St", "HR", 50000.0);
//         PartTimeStaff partTimeStaff = new PartTimeStaff("Alice", "456 Elm St", 20, 15.0);

//         System.out.println("Full Time Staff Details:");
//         System.out.println("Name: " + fullTimeStaff.name);
//         System.out.println("Address: " + fullTimeStaff.address);
//         System.out.println("Department: " + fullTimeStaff.department);
//         System.out.println("Salary: $" + fullTimeStaff.salary);

//         System.out.println("\nPart Time Staff Details:");
//         System.out.println("Name: " + partTimeStaff.name);
//         System.out.println("Address: " + partTimeStaff.address);
//         System.out.println("Number of Hours: " + partTimeStaff.numberOfHours);
//         System.out.println("Rate per Hour: $" + partTimeStaff.ratePerHour);
//     }
// }
class Vehicle {
    String regNo;
    String companyName;
    double price;

    void setData(String regNo, String companyName, double price) {
        this.regNo = regNo;
        this.companyName = companyName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Registration Number: " + regNo);
        System.out.println("Company Name: " + companyName);
        System.out.println("Price: " + price);
    }
}

class LightMotorVehicle extends Vehicle {
    double mileage;

    void setData(String regNo, String companyName, double price, double mileage) {
        super.setData(regNo, companyName, price);
        this.mileage = mileage;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Mileage: " + mileage);
    }
}

class HeavyMotorVehicle extends Vehicle {
    double capacityInTons;

    void setData(String regNo, String companyName, double price, double capacityInTons) {
        super.setData(regNo, companyName, price);
        this.capacityInTons = capacityInTons;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Capacity in Tons: " + capacityInTons);
    }
}

public class A3P3 {
    public static void main(String[] args) {
        LightMotorVehicle lightVehicle = new LightMotorVehicle();
        HeavyMotorVehicle heavyVehicle = new HeavyMotorVehicle();

        System.out.println("Details for Light Motor Vehicle:");
        lightVehicle.setData("LMV123", "Hero Motors", 50000.0, 20.5);

        System.out.println("\nDetails for Heavy Motor Vehicle:");
        heavyVehicle.setData("HMV456", "Honda Motors", 80000.0, 5.0);

	System.out.println("\nDetails of Light Motor Vehicle:");
        lightVehicle.displayDetails();

        System.out.println("\nDetails of Heavy Motor Vehicle:");
        heavyVehicle.displayDetails();
    }
}
