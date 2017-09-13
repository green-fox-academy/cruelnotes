public class UrlFixer {

    public static void main(String args[]){

        //  String url = "https//www.reddit.com/r/nevertellmethebots";
        String url = new String("https//www.reddit.com/r/nevertellmethebots");

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        String oddsFix = url.replace("bots", "odds");
        String httpFix = oddsFix.replace("https", "https:");

        System.out.println("First solution:");
        System.out.println(httpFix);

        // System.out.println(url.replace("bots", "odds"));

        String urlStart = "https:";
        String urlEnd = "odds";
        String urlMid = url.substring(5,38);

        System.out.println("Second solution:");
        System.out.println(urlStart + urlMid + urlEnd);

    }
}