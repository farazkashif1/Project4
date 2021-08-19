public class Book {//SRP means a class should have only one responsibility
    private String bookName;
    private String author;
    private String text;

    public boolean findbyAuthor(String authorNamw){
        return author.contains(authorNamw);
    }
    public boolean findbyName(String bookName){
        return bookName.contains(bookName);
    }
}
class BookPrinter {
    void printtextToConsole(String text){
        System.out.println(text);
    }
}

