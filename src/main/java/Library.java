import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void printBookByID(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (id == books.get(i).getId()) {
                System.out.println(books.get(i).getId());
            }
        }
    }

    public void printBookByPublish(String name) {
        for (int i = 0; i < books.size(); i++) {
            if (name == books.get(i).getPublish()) {
                System.out.println(books.get(i).getPublish());
            }
        }
    }
}