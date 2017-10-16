public class Bird extends Animal{

    public Bird (String name) {
        super.name = name;
    }

    @Override
    public void greet() {
        System.out.println("Bird is the word.");
    }

    @Override
    public String wantChild() {
        return "bird wants a child from an egg!";
    }

    @Override
    public void doSomething() {
        System.out.println("Flapping wings.");
    }
}