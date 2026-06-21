public class Main {

    public static void main(String[] args) {

        Student student = new Student("Aditya", 101, "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        System.out.println();

        controller.setStudentName("Rahul");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}