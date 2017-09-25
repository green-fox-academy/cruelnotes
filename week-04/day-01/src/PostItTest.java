public class PostItTest {

    public static void main(String[] args) {

        PostIt one;
        one = new PostIt();
        one.backgroundColor = "orange";
        one.textOnIt = "Idea 1";
        one.textColor = "blue";
        one.classProp();

        PostIt two;
        two = new PostIt();
        two.backgroundColor ="pink";
        two.textOnIt = "Awesome!";
        two.textColor = "black";
        two.classProp();

        PostIt three;
        three = new PostIt();
        three.backgroundColor = "yellow";
        three.textOnIt = "Superb!";
        three.textColor = "green";
        three.classProp();
    }
}
