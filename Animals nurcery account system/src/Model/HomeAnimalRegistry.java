package Model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class HomeAnimalRegistry {
    List<String[]> readDataFromFile(String path) {
        List<String[]> list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(path), StandardCharsets.UTF_8)) {
            while (sc.hasNextLine()) {
                list.add(sc.nextLine().split(";"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (list.isEmpty()) System.out.println("Регистр пуст. Добавьте данные животных.");
        return list;
    }
    public void writeToyDataToFile(List<Animals> animalsList, String path) throws IOException {
        OutputStream outStream = new FileOutputStream(path);
        String titles = "N;ID;Name;Day_of_birth;Commands\n";
        outStream.write(titles.getBytes(StandardCharsets.UTF_8));
        for (Animals animal : animalsList) {
            outStream.write((animal.ID.substring(animal.ID.indexOf("#") + 1, animal.ID.indexOf("-")) + ";" + animal.ID + ";"
                    + animal.name + ";" + animal.commands + ";" + ";\n").getBytes(StandardCharsets.UTF_8));
        }
        outStream.close();
    }

    public void writeDataToFile(List<String[]> animalList, String path) throws IOException {
        OutputStream outStream = new FileOutputStream(path);
        String titles = "N;ID;Name;Day_of_birth;Commands\n";
        outStream.write(titles.getBytes(StandardCharsets.UTF_8));
        for (String[] animal : animalList) {
            outStream.write((animal[0] + ";" + animal[1] + ";" + animal[2] + ";" + animal[3] +  animal[4] +";\n").getBytes(StandardCharsets.UTF_8));
        }
        outStream.close();
    }
}
