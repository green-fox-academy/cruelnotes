public class Main {
//Create a function that takes an array of integers and returns the average of the even numbers from that array
    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(avgOfInts(myIntArray));
    }

    private static int avgOfInts(int[] intArr) {
        int sumOfEven = 0;
        int numOfEven = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                sumOfEven += intArr[i];
                numOfEven++;
            }
        }
        return sumOfEven / numOfEven;
    }
}
