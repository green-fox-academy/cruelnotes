import java.util.*;

public class ElementFinder {

    // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
    // Do this again with a different solution using different list functions!

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        // Method 1

        if (arrayList.contains(7) == true){
            System.out.println("Hoorray");
        } else {
            System.out.println("Noooooo");
        }

        // Method 2

        boolean containsSeven = false;
        int seven = 7;

        for (int i=0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == seven) {
                containsSeven = true;
            }

            if (containsSeven) {
                System.out.println("Hoorray");
                break;
            } else {
                System.out.println("Noooooo");
                break;
            }
        }
    }
}

