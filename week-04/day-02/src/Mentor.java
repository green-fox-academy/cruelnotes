public class Mentor extends Person {

    public String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }
    private Mentor() {
        this("Jane Doe", 30, "female", "intermadiate");
        System.out.println("He/She is a mentor.");
    }

    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s %s level mentor. %n", name, age, gender, level);
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public static void main(String[] args) {

//        Mentor szilvi = new Mentor("Szilvi", 26, "female", "junior");
//        szilvi.introduce();
//        szilvi.getGoal();
//
//        Mentor jane = new Mentor();
//        jane.introduce();
//        jane.getGoal();
    }

}
