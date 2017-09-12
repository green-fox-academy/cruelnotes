public class AppendAArray {

    // - Create an array variable named `nimals`
    //   with the following content: `["kuty", "macs", "cic"]`
    // - Add all elements an `"a"` at the end

    public static void main(String[] args) {

        String[] nimals = {"kuty", "macs", "cic"};
        //    System.out.println(appendA(nimals));

        for (int i = 0; i < nimals.length; i++) {
            nimals[i] = nimals[i] + "a";

        }
    }
}
