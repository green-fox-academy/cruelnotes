public class Koala extends Animal{

    public Koala(String name) {
        super.name = name;
    }

    @Override
    public void greet() {
        System.out.println("Hiez!");
    }

    @Override
    public String wantChild() {
        return "koala wants a child from my uterus!";
    }

    @Override
    public void doSomething() {
        System.out.println("Nope, I'm high.");
    }
}