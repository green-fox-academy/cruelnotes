public class TodoPrint {
    public static void main(String... args){
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println();
        String todoText = ("My todo:\n - Buy milk\n - Download games\n" + "\t - Diablo\n");

        System.out.println(todoText);
    }
}
