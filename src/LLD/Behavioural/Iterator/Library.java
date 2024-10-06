package LLD.Behavioural.Iterator;

import java.util.List;

public class Library implements Aggregrate{

    List<Books> booksList;
    public Library(List<Books> booksList){
        this.booksList = booksList;
    }
    @Override
    public Iterator createIterator() {
        return new BooksIterator(booksList);
    }
}
