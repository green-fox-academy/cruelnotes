// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

public class String3 {
    public static void main(String[] args) {
        System.out.println(asterixInserter("works yet?"));
    }

    private static String asterixInserter(String s) {

        if (s.length() == 1){
            return s;
        } else {
            return s.charAt(0) + "*" + asterixInserter(s.substring(1,s.length()));
        }
    }
}

//        int s1 = s0 + 2;
//        if (s0 == s.length() - 2) {
//            return s;
//        } else if(s.substring(s0,s1).equals(".\\s") || s.substring(s0,s1).equals("\\s.") || s.substring(s0,s1).equals("\\S\\*") || s.substring(s0,s1).equals("\\*\\S")  ) {
//            return asterixInserter(s,s0 + 1);
//        } else {
//           String sR = s.substring(s0,s0 + 1) + "*" + s.substring(s0 + 1, s.length());
//           return asterixInserter(sR,s0 + 2);
//        }
