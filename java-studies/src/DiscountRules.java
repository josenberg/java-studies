/**
 * Created by vntjomg on 12/6/16.
 */
public class DiscountRules {
    public static void main (String[] args) {

        Book book = new Book();
        book.setPrice(59.00);
        System.out.println("Current price: " + book.getPrice());

        if(!book.applyDiscount(0.1)) {
            System.out.println("The discount is too high to be done");
        } else {
            System.out.println("Discount applied succefully, the new price is: " + book.getPrice());
        }
    }
}
