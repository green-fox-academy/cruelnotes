public class SumOfAllElements {

    // - Create an array variable named `ai`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Print the sum of the elements in `ai`

    public static void main(String[] args) {

        int[] ai = {3, 4, 5, 6, 7};

        System.out.println(sumOfAll(ai));

    }

    public static int sumOfAll(int[] elements) {

        int total = 0;
            for (int i = 0; i < elements.length; i++) {
                total += elements[i];
            }
        return total;
    }

}
