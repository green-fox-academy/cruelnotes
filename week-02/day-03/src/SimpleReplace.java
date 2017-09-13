package com.stringtutorial;

public class SimpleReplace {

    // I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
    // Please fix it for me!
    // Expected ouput: In a galaxy far far away

    //ORIGINAL CODE

    //public static void main(String... args){
    //    String example = "In a dishwasher far far away";
    //
    //    example.replace("dishwasher", "galaxy");
    //
    //    // I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
    //    // Please fix it for me!
    //    // Expected ouput: In a galaxy far far away
    //
    //    System.out.println(example);
    //}


    public static void main(String args[]){

        String Example = new String("In a dishwasher far far away");

        System.out.println(Example.replace("dishwasher", "galaxy"));

        //  System.out.println(example);
    }
}
