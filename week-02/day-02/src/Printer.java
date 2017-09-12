import java.lang.reflect.Array;

public class Printer {

    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `printer`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printer("first")
    // printer("first", "second")
    // printer("first", "second", "third", "fourh")
    // ...

    public static void main(String[] args) {

        String[] parameters = {"first","second","third"};

        printer(parameters);
    }

    public static void printer(String printInput[]) {
        for (int i = 0; i < printInput.length; i++ ) {
            System.out.println(printInput[i]);
        }
    }

}
