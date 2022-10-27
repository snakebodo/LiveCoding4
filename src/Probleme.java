import java.util.ArrayList;

public class Probleme {

    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Scufita Rosie");
        books.add("Capra cu 3 iezi");
        books.add("Harry Potter");

        for(String book: books) {
            if(book.toLowerCase().contains("c")) {
                System.out.println(book);
            }
        }

    }
}
