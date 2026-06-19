public class Company {

    private Employee[] staff;
    private int employeeCount;

    public Company(int capacity) {
        staff = new Employee[capacity];
        employeeCount = 0;
    }

    public void addEmployee(Employee employee) {

        if (employeeCount >= staff.length) {
            System.out.println("Employee limit reached.");
            return;
        }

        staff[employeeCount] = employee;
        employeeCount++;

        System.out.println("Employee record inserted.");
    }

    public void traverseEmployee() {

        if (employeeCount == 0) {
            System.out.println("No employee records available.");
            return;
        }

        for (int i = 0; i < employeeCount; i++) {
            System.out.println(staff[i]);
        }
    }

    public void searchEmployee(int employeeId) {

        for (Employee employee : staff) {

            if (employee != null && employee.getId() == employeeId) {
                System.out.println(employee);
                return;
            }
        }

        System.out.println("Employee does not exist.");
    }

    public void deleteEmployee(int employeeId) {

        int index = -1;

        for (int i = 0; i < employeeCount; i++) {

            if (staff[i].getId() == employeeId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee does not exist.");
            return;
        }

        for (int i = index; i < employeeCount - 1; i++) {
            staff[i] = staff[i + 1];
        }

        staff[employeeCount - 1] = null;
        employeeCount--;

        System.out.println("Employee removed successfully.");
    }
}