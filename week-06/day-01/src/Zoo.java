public class Zoo {

    public static void main(String[] args) {
        Crocodile crocodile = new Crocodile("Master");
        Koala koala = new Koala("Panda");
        Bird bird = new Bird("Gyurika");
        System.out.println("Who want a baby?");
        System.out.println(crocodile.getName() + " the " + crocodile.wantChild());
        System.out.println(koala.getName() + " the " + koala.wantChild());
        System.out.println(bird.getName() + " the " + bird.wantChild());
    }
}