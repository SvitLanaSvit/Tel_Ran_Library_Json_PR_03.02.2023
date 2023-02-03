package task3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "listJson.txt";

        List<MyLibrary> list = Generator.createLibrary();
        List<MyLibrary> listRead = new ArrayList<>();


        try( LibrarySerializer librarySerializer = new LibrarySerializer(path)){
            librarySerializer.writeToFileJson(list);
            listRead = librarySerializer.readFromFileJson();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(listRead);
    }
}
