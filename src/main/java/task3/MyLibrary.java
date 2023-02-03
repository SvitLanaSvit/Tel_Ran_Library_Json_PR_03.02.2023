package task3;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
public class MyLibrary {
    private Book book;
    private Subscriber subscriber;

    public MyLibrary(Book book, Subscriber subscriber){
         this.book = book;
         this.subscriber = subscriber;
    }
}
