public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        int gfDailyCode = 6;

        // The semester is 17 weeks long
        int gfSemesterWeeks = 17;

        // Print how many hours is spent with coding in a semester by an attendee,
        int workdayPerWeek = 5;

        // if the attendee only codes on workdays.

        int hoursPerSemester = gfDailyCode * workdayPerWeek * gfSemesterWeeks;

        System.out.println("An average Green Fox attendee spends " + hoursPerSemester + " hours with coding  in a semester." );

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int workHoursWeekly = 52;

        int percentage = hoursPerSemester * 100  / (workHoursWeekly * gfSemesterWeeks);

        System.out.println("Percentage of the coding hours in the semester: " + (percentage) + "%");
    }
}