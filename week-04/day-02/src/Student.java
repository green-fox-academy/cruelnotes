public class Student extends Person {

    public String previousOrganization;
    public int skippedDays;


    public Student(String name, int age, String gender, String previousOrganization, int skippedDays) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = skippedDays;

    }

    public Student() {
            this("Jane Doe", 30, "female", "The School of Life", 0);
        System.out.println("He/She is a student.");
        }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }


    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s from %s who skipped %d days %n", name, age, gender, previousOrganization, skippedDays);
    }

    public static void main(String[] args) {

        Student tamas = new Student("Tamas", 33, "male", "iskola", 4);
        tamas.introduce();
        tamas.getGoal();

        Student jane = new Student();
        jane.introduce();
        jane.getGoal();
    }

}
