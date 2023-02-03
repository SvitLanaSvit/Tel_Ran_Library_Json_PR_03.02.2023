package task3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.util.ArrayList;

public class LibrarySerializer implements Closeable{
    private File file;

    public LibrarySerializer(String path) throws IOException{
         file = new File(path);
    }
    public void writeToFileJson(ArrayList<MyLibrary> list){
//        Gson gson = new Gson();
//        String json = gson.toJson(list);
        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            //objectMapper.writeValue(new File(path), list);
            String str = objectMapper.writeValueAsString(list);
            objectMapper.writeValue(file, list);
            System.out.println("DONE!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void close() throws IOException {
        //file.close();
    }
}