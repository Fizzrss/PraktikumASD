import java.util.Stack;

public class stackDemo {
    public static void main(String[] args) {
        book book1 = new book("1234", "Dasar Pemrograman");
        book book2 = new book("7145", "Hafalah Shalat Delisa");
        book book3 = new book("1234", "Muhammad Al-Fatih");

        Stack<book> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        book temp = books.peek();
        if (temp != null) {
            System.out.println(temp.toString());
        }

        book temp2 = books.pop();
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }
        System.out.println("--- mencetak data buku ---");
        for (book Book : books) {
            System.out.println(Book.toString());
        }

        System.out.println(books);
    }
}
