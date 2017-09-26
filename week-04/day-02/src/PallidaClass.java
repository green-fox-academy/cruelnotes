import java.util.ArrayList;

public class PallidaClass {

    public String className;
    public ArrayList<String> students = new ArrayList();
    public ArrayList<String> mentors = new ArrayList();


    public PallidaClass(ArrayList students, ArrayList mentors) {
        this.students = students;
        this.mentors = mentors;
    }

    public PallidaClass() {
        this(null,null);
        System.out.println("Class created");
    }

    public String addStudent(String student, ArrayList students) {
        this.students.add(student);
        return student;
    }

    public String addMenntor(String mentor, ArrayList mentors) {
        this.mentors.add(mentor);
        return mentor;
    }

    public static void main(String[] args) {

        PallidaClass mine;
        mine = new PallidaClass();

    }

}
