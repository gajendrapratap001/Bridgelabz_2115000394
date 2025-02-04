public class Employee {
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("Company: " + companyName);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Aman", "Manager");
        Employee e2 = new Employee(102, "Bobby", "Developer");

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        Employee.displayTotalEmployees();
    }
}
