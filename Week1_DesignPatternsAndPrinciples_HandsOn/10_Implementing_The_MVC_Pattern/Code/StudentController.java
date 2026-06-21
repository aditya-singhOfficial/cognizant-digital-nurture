public class StudentController {

    private Student student;
    private StudentView view;

    public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    public void setStudentName(String name) {
        student.setStudentName(name);
    }

    public String getStudentName() {
        return student.getStudentName();
    }

    public void setRollNo(int rollNo) {
        student.setRollNo(rollNo);
    }

    public int getRollNo() {
        return student.getRollNo();
    }

    public void setStudentGrade(String grade) {
        student.setGrade(grade);
    }

    public String getStudentGrade() {
        return student.getGrade();
    }

    public void updateView() {
        view.showStudentInfo(
                student.getStudentName(),
                student.getRollNo(),
                student.getGrade()
        );
    }
}