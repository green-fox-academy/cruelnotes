public class BlogPostTest {
    public static void main(String[] args) {
        BlogPost n001;
        n001 = new BlogPost();
        n001.authorName = "John Doe";
        n001.title = "Lorem ipsum";
        n001.publicationDate = "2000.05.04";
        n001.text = "Lorem ipsum dolor sit amet.";
        n001.postDetails();
        System.out.println();
        BlogPost n002;
        n002 = new BlogPost();
        n002.authorName = "Tim Urban";
        n002.title = "Wait nut why";
        n002.publicationDate = "2010.10.10";
        n002.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        n002.postDetails();
        System.out.println();
        BlogPost n003;
        n003 = new BlogPost();
        n003.authorName = "Wiliam Turton";
        n003.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        n003.publicationDate = "2017.03.28.";
        n003.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn�t want to be the center of attention. When I asked to take his picture outside one of IBM�s New York City offices, he told me that he wasn�t really into the whole organizer profile thing.";
        n003.postDetails();
    }
}
