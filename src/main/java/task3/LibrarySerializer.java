package task3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class LibrarySerializer implements Closeable{
    private File file;

    public LibrarySerializer(String path) throws IOException{
         file = new File(path);
    }
    public void writeToFileJson(List<MyLibrary> list){
//        ObjectMapper objectMapper = new ObjectMapper();
//        try {
//            //objectMapper.writeValue(new File(path), list);
//            String str = objectMapper.writeValueAsString(list);
//            objectMapper.writeValue(file, list);
//            System.out.println("DONE!");
//        } catch (JsonProcessingException e){
//            System.out.println(e.getMessage());
//        }
//        catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String str = gson.toJson(list);

        try(FileWriter writer = new FileWriter(file)){
            writer.write(str);
            System.out.println("DONE!");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public List<MyLibrary> readFromFileJson(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Type t = new TypeToken<List<MyLibrary>>(){}.getType();
        StringBuilder sb = new StringBuilder();
        try(FileReader reader = new FileReader(file)){
            int characters;
            while((characters = reader.read()) != -1){
                sb.append((char)characters);
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return gson.fromJson(sb.toString(), t);
    }

    @Override
    public void close() throws IOException {
        //file.close();
    }
}