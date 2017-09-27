    //Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
    //Create a test for that.

public class Anagram {
    private String str1;
    private String str2;

    public Anagram(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public boolean isReverse(String str1, String str2) {
        int i, len = str2.length();
        StringBuilder rts2 = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--) {
            rts2.append(str2.charAt(i));
        }
        if (str1.equals(rts2)) {
            return true;
        } else {
            return false;
        }
    }


}
