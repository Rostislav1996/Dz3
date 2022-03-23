import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1= new Book(1,"ОНО","Стивен Кинг",1986,"new");
        Book book2= new Book(3,"Мастер и Маргарита","Михаил Булгаков ",1967,"Рос");
        Book book3= new Book(6,"Вий","Николай Гоголь ",1835,"Укр");
        Book book4= new Book(8,"Красная Таблетка","Андрей Курпатов ",2017,"Спб");
        List<Book>books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        Library library = new Library (books);
       library.printBookByPublish("ОНО");
        System.out.println(books.get(i).getPublish());



    }

}
