public class Main {

    public static void main(String[] args) {

        Company company = new Company(5);

        company.addEmployee(new Employee(101, "Aditya Singh", "Software Engineer", 45000));
        company.addEmployee(new Employee(102, "Aryan", "QA Engineer", 40000));
        company.addEmployee(new Employee(103, "Karan", "System Administrator", 55000));
        company.addEmployee(new Employee(104, "Ritika", "HR Executive", 50000));
        company.addEmployee(new Employee(105, "Vikram", "Network Engineer", 60000));

        System.out.println("\nEmployee Records");
        System.out.println("-------------------------");
        company.traverseEmployee();

        System.out.println("\nSearch Result");
        System.out.println("-------------------------");
        company.searchEmployee(104);

        System.out.println("\nAfter Deletion");
        System.out.println("-------------------------");
        company.deleteEmployee(102);
        company.traverseEmployee();
    }
}