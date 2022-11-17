package AmericanWriters;

public class Novel implements Edition {

    public static final String AMERICAN_CITIZENSHIP = "american";
    public static int countOfPublishedBooks = 0;
    public static int count;

    private final String name;
    private String author;
    private String citizenship;

    private Publisher publisher;
    private boolean isPublished;

    public Novel(String name) {
        count++;
        this.name = name;
        this.citizenship = AMERICAN_CITIZENSHIP;
    }
    @Override
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getCitizenship() {
        return citizenship;
    }
    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }
    public static String getStatistic() {
        return "Number of published books: " + countOfPublishedBooks + "\n"
                + "Number of books on AmericanWriters: " + count;
    }
    public void publish(Publisher publisher) {
        incrementCounter();
        this.publisher = publisher;
        this.isPublished = true;
    }
    public void act(Publisher publisher) {
        System.out.println("Hello publisher!");
    }
    public void act(Maker maker) {
        System.out.println("Hello maker!");
    }
    public void act(Editor editor) {
        System.out.println("Hello editor!");
    }
    private void incrementCounter() {
        countOfPublishedBooks++;
    }
    @Override
    public String toString() {
        return "Novel{" +
                "count=" + count +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher=" + publisher +
                ", isPublished=" + isPublished +
                '}';
    }
}
