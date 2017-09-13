import java.util.*;

// Join the two lists by matching one girl with one boy in the order list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...

public class Matchmaking{


    public static void main(String[] args){

        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<String>();

        for (int i = 0; i < girls.size(); i++) {
            order.add(i, girls.get(i));
            order.add(i, boys.get(i));
        }

        order.add(boys.get(boys.size()-1));
        System.out.println(order);
    }
}
