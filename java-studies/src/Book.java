/**
 * Created by vntjomg on 12/6/16.
 */
public class Book {
    private String name;
    private String description;
    private double price;
    private String isnb;
    private Author author;

    public Book(Author author) {
        // the author is required
        this.setAuthor(author);
    }

    public Book() {

    }

    void showDetails() {
        System.out.println("--- Book details");
        System.out.println("Name: " + this.getName());
        System.out.println("Description: " + this.getDescription());
        System.out.println("ISNB: " + this.getIsnb());
        System.out.println("- Author ");
        System.out.println("Name: " + this.getAuthor().getName());
        System.out.println("Email: " + this.getAuthor().getEmail());
    }

    public boolean applyDiscount(double percentage) {
        if(percentage > 0.3) {
            return false;
        }
        this.setPrice(this.getPrice() - (this.getPrice() * percentage));
        return true;
    }


    void setPrice(double price) {
        this.price = price;
    }

    double getPrice(){
        return this.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsnb() {
        return isnb;
    }

    public void setIsnb(String isnb) {
        this.isnb = isnb;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
