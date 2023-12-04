class Person {
    String name;
    String address;
    int age;

    Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int roll;
    String department;

    Student(String name, String address, int age, int roll, String department) {
        super(name, address, age);
        this.roll = roll;
        this.department = department;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Roll: " + roll);
        System.out.println("Department: " + department);
    }
}

class ExStudent extends Student {
    String organizationName;
    String officeEmail;

    ExStudent(String name, String address, int age, int roll, String department,
                     String organizationName, String officeEmail) {
        super(name, address, age, roll, department);
        this.organizationName = organizationName;
        this.officeEmail = officeEmail;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Office Email: " + officeEmail);
    }
}

class CurrentStudent extends Student {
    int semester;
    double sgpa;

    public CurrentStudent(String name, String address, int age, int roll, String department,
                          int semester, double sgpa) {
        super(name, address, age, roll, department);
        this.semester = semester;
        this.sgpa = sgpa;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Semester: " + semester);
        System.out.println("SGPA: " + sgpa);
    }
}

class Faculty extends Person {
    String majorSubject;
    String publication;

    public Faculty(String name, String address, int age, String majorSubject, String publication) {
        super(name, address, age);
        this.majorSubject = majorSubject;
        this.publication = publication;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major Subject: " + majorSubject);
        System.out.println("Publication: " + publication);
    }
}

public class A3P5 {
    public static void main(String[] args) {
        ExStudent exStudent = new ExStudent("Soubhik", "Kolaghat", 25, 101, "Computer Science",
                "tcs", "soubhik123@gmail.com");

        CurrentStudent currentStudent = new CurrentStudent("Samapan", "Kolkata", 20, 201, "Electrical Engineering",
                3, 3.75);

        Faculty faculty = new Faculty("Dr.Rakhahari Pal", "Kharagpur", 45, "Math", "Published papers Merkov's Chain ");

        System.out.println("ExStudent Details:");
        exStudent.displayInfo();
        System.out.println();

        System.out.println("CurrentStudent Details:");
        currentStudent.displayInfo();
        System.out.println();

        System.out.println("Faculty Details:");
        faculty.displayInfo();
    }
}
