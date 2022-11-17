import AmericanWriters.Editor;
import AmericanWriters.Novel;
import AmericanWriters.Publisher;

public class Application {

    public static void main(String[] args) {

        Publisher publisher = new Publisher();
        publisher.setName("Charles");
        publisher.setLastName("Scribner");

        Editor editor = new Editor();

        Novel novel = new Novel("Berenika");
        novel.setAuthor("Edgar Poe");

        Novel novel2 = new Novel("Old man and the Sea");
        novel2.setAuthor("Ernest Hemingway");

        Novel novel3 = new Novel("Lord of Light");
        novel3.setAuthor("Roger Zelazny");

        Novel novel4 = new Novel("John Carter of Mars");
        novel4.setAuthor("Edgar Burroughs");

        novel.publish(publisher);
        novel2.publish(publisher);

        System.out.println(Novel.getStatistic());

        publisher.showYourWork();
        editor.showYourWork();
    }
}
