public class book {
    public String isbn;
    public String title;

    public book(){

    }

    public book(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }

    public String toString(){
        return "ISBN: " + this.isbn + "Title: " + this.title;
    }
}
