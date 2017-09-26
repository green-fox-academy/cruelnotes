public class Sponsor extends Person {

    public String company;
    public int hiredStudent;


    public Sponsor(String name, int age, String gender, String company, int hiredStudent) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudent = hiredStudent;
    }

    public Sponsor() {
        this("Jane Doe", 30, "female", "Google", 0);
    }

    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s who represents %s and hired %d students so far.%n", name, age, gender, company, hiredStudent);
    }

    public int hire() {
        return hiredStudent++;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    public static void main(String[] args) {


        Sponsor miska = new Sponsor("Mágnás Miska", 66, "male", "Google", 0);
        miska.hire();
        miska.introduce();
        miska.getGoal();

        Sponsor jane = new Sponsor();
        jane.hire();
        jane.introduce();
        jane.getGoal();


    }

}
