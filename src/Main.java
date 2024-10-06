import LLD.Behavioural.Iterator.Books;
import LLD.Behavioural.Iterator.Library;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // DECORATOR
//        BasePizza pizza = new Jalepeno(new ExtraCheese(new Margherita()));
//        System.out.println(pizza.cost());
        // ADAPTER
//        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabiesImpl());
//        System.out.println(weightMachineAdapter.getWeightInKg());

        // COMPOSITE
//        Directory movieDirectory = new Directory("movie");
//
//        FileSystem border = new File("Border");
//        movieDirectory.add(border);
//
//        Directory comedyDirectory = new Directory("ComedyMovie");
//        FileSystem hulchul = new File("hulchul");
//        comedyDirectory.add(hulchul);
//        movieDirectory.add(comedyDirectory);
//        movieDirectory.ls();

//        // BRIDGE
//        LivingThings livingThingsObj = new Dog(new DogImplementation());
//        livingThingsObj.BreatheProcess();

        //Observer
//        StockObservable iphoneStockObservable = new IphoneObservableImpl();
//
//        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com",iphoneStockObservable);
//        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz@gmail.com",iphoneStockObservable);
//        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("subodh_12",iphoneStockObservable);
//
//        iphoneStockObservable.add(observer1);
//        iphoneStockObservable.add(observer2);
//        iphoneStockObservable.add(observer3);
//
//        iphoneStockObservable.setStockCount(10);

        //CHAIN OF RESPOSIBILITY
//        LogProcessor logProcessorobj = new InfoProcessor(new ErrorProcessor(new DebugLogger(null)));
//        logProcessorobj.log(logProcessorobj.ERROR,"exception occured");
//        logProcessorobj.log(logProcessorobj.DEBUG,"NEED TO DEBUG THIS ");
//        logProcessorobj.log(logProcessorobj.INFO,"NEED TO LOG THIS INFO ");

        //ITERATOR

//        List<Books> booksList = Arrays.asList(new Books(100,"Science"),
//                new Books(200,"Maths"),
//                new Books(100,"GK")
//        );
//
//        Library lib = new Library(booksList);
//        Iterator iterator = lib.createIterator();
//
//        while(iterator.hasNext()){
//            Books book = (Books) iterator.next();
//            System.out.println(book.getBookname());
//        }



    }
}