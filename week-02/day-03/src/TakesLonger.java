public class TakesLonger {
    public static void main(String... args){

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String quoteStart = quote.substring(0, 21);
        String quoteEnd = quote.substring(21, quote.length());
        String quoteMid = "always takes longer than ";

        quote = quoteStart + quoteMid + quoteEnd;
        System.out.println(quote);
    }
}