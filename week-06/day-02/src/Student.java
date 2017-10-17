public class Student extends Person implements Cloneable {

    public String previousOrganization;
    public int skippedDays;


    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }

    public Student() {
        this("Jane Doe", 30, "female", "The School of Life");
        System.out.println("He/She is a student.");
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }


    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s from %s who skipped %d days %n", name, age, gender, previousOrganization);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) throws CloneNotSupportedException {

//        Student tamas = new Student("Tamas", 33, "male", "iskola");
//        tamas.introduce();
//        tamas.getGoal();
//
//        Student jane = new Student();
//        jane.introduce();
//        jane.getGoal();

        Student john = new Student("John Doe", 20, "male", "BME");

        Student johnTheClone = (Student) john.clone();

    }

}
