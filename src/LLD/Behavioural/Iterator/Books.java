package LLD.Behavioural.Iterator;

public class Books {
    private int price;
    private String bookname;

    public Books(int price, String bookname){
        this.price = price;
        this.bookname = bookname;
    }

    public int getPrice(){
        return price;
    }
    public String getBookname(){
        return bookname;
    }
}
