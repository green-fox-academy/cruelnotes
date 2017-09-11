public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented bt the variables

        int totalHours = 24;
        int totalMinutes = 60;
        int totalSeconds = 60;

        int remHours = (totalHours - currentHours) * 60 * 60;
        int remMinutes = (totalMinutes - currentMinutes) * 60;
        int remSeconds = totalSeconds - currentSeconds;

        int remAll = remHours + remMinutes + remSeconds;

        System.out.println("Ramaining seconds: " + remAll);

    }
}