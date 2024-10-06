package LLD.Behavioural.Iterator;

import java.util.List;

public class BooksIterator implements Iterator{
    private List<Books> booksList;
    private int index = 0;

    public BooksIterator(List<Books> booksList){
        this.booksList = booksList;
    }
    @Override
    public boolean hasNext() {
        return index < booksList.size();
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return booksList.get(index++);
        }
        return null;
    }
}
