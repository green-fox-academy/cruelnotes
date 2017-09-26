public class Student extends Person{

    public String previousOrganization;
    public int skippedDays;

    public void getGoal() {
        System.out.println("Be a junior sottware developer.");
    }

    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s.", name, age, gender);
    }

}
