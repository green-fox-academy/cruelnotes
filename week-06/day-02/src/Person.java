public class Person {

    public String name;
    public int age;
    public String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public Person() {
        this("Jane Doe", 30, "female");
        System.out.println("Jane Doe created");
    }

    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s. %n", name, age, gender);
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
//        Person me;
//        me = new Person();
//        me.name = "Adam";
//        me.age = 28;
//        me.gender = "male";
//        me.introduce();
//        me.getGoal();
//
//        Person test;
//        test = new Person("Test Elek", 200, "male");
//
//
//        Person jane = new Person();
//
//        System.out.println(jane.name);
//        System.out.println(me.name);
//        System.out.println(test.name);

    }
}
