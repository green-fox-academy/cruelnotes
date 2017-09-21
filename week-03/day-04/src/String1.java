// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class String1 {
    public static void main(String[] args) {
        System.out.println(changeX("isx itx working?X" ));
    }

    private static String changeX(String s) {
        if (s.contains("x")) {
            return changeX(s.replaceFirst("x", " "));
        } else {
            return s;
        }
    }
}