import java.util.List;

public class Library {


    private final List<Book1> books;

    Library (List<Book1> books)
    {
        this.books = books;
    }

    public List<Book1> getTotalBooksInLibrary(){

        return books;
    }

}
