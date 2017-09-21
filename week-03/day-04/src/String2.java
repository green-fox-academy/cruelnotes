// Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class String2 {
    public static void main(String[] args) {
        System.out.println(changeX("isx itx working?X" ));
    }

    private static String changeX(String s) {
        if (s.contains("x")) {
            return changeX(s.replaceFirst("x", ""));
        } else if (s.contains("X")) {
            return changeX(s.replaceFirst("X", ""));
        } else {
            return s;
        }
    }
}