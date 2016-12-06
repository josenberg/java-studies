/**
 * Created by vntjomg on 12/6/16.
 */
public class BookStore {
    public static void main (String[] args) {

        Author asimov = new Author();
        asimov.setName("Isaac Asimov");
        asimov.setEmail("isaac.asimov@gmail.com");

        Book foundation = new Book(asimov);
        foundation.setName("Foundation");
        foundation.setDescription("Foundation is the first novel in Isaac Asimov's Foundation Trilogy (later expanded into The Foundation Series). Foundation is a cycle of five interrelated short stories, first published as a single book by Gnome Press in 1951. Collectively they tell the story of the Foundation, an institute to preserve the best of galactic civilization after the collapse of the Galactic Empire.");;
        foundation.setPrice(99.00);
        foundation.setIsnb("123-12-2131");

        foundation.showDetails();


    }
}
