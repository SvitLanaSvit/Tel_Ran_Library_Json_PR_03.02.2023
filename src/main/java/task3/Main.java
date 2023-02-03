package task3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "listJson.txt";

        ArrayList<MyLibrary> list = new ArrayList<>(List.of(
                new MyLibrary(new Book("The Knife of Never Letting Go", "Patrick Ness"), new Subscriber("Svit", "Lana", 25)),
                new MyLibrary(new Book("TThe Ask and the Answer", "Patrick Ness"), new Subscriber("Dmytro", "Fomin", 15))
        ));

        System.out.println(list);
        try( LibrarySerializer librarySerializer = new LibrarySerializer(path)){
            librarySerializer.writeToFileJson(list);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
