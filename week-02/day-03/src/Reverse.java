import java.util.*;

public class Reverse {

    // Create a function that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

    public static void main(String... args){

        String reversedOriginal = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        reverser(reversedOriginal);

    }

    public static void reverser(String reversed) {

        String[] reversedArray = reversed.split("");
        List<String> reversedChar = new ArrayList<String>();

        for(int k = reversed.length() - 1; k > 0; k--){
            reversedChar.add(reversedArray[k]);
        }

        String reversedFixed = String.join("", reversedChar);
        System.out.println(reversedFixed);

    }

}