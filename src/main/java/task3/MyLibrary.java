package task3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MyLibrary{
    private Book book;
    private Subscriber subscriber;

    public MyLibrary(Book book, Subscriber subscriber){
         this.book = book;
         this.subscriber = subscriber;
    }
}
