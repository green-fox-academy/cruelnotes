public class Crocodile extends Animal {

    public Crocodile(String name) {
        super.name = name;
    }

    @Override
    public void greet() {
        System.out.println("Hi!");
    }

    @Override
    public String wantChild() {
        return "crocodile wants a child from an egg!";
    }

    @Override
    public void doSomething() {
        System.out.println("Grabs your arm and eats it.");
    }
}