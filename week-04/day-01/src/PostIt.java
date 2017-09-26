//    Create a PostIt class that has
//            a backgroundColor
//            a text on it
//            a textColor
//            Create a few example post-it objects:
//    an orange with blue text: "Idea 1"
//    a pink with black text: "Awesome"
//    a yellow with green text: "Superb!"

public class PostIt {
    String backgroundColor;
    String textOnIt;
    String textColor;

    public PostIt () {

    }

    public void classProp() {
        System.out.println("Text is: " + textOnIt);
        System.out.println("Textcolor: " + textColor);
        System.out.println("Background color: " + backgroundColor);
    }
}
