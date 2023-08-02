package Controller;

import Model.Animals;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class HomeAnimalRegistry {
    List<String[]> readDataFromFile(String path) {
        //C:\Users\jngva\gb\Final_certification\Animals nursery account system\src\Sources
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
    public void writeAnimalDataToFile(List<Animals> animalsList, String path) throws IOException {
        OutputStream outStream = new FileOutputStream(path);
        String titles = "N;ID;Name;Day_of_birth;Commands\n";
        outStream.write(titles.getBytes(StandardCharsets.UTF_8));
        for (Animals animal : animalsList) {
            outStream.write((animal.getID().substring(animal.getID().indexOf("#") + 1, animal.getID().indexOf("-")) + ";" + animal.getID() + ";"
                    + animal.getName() + ";"+ animal.getDayOfBirth() + ";" + animal.getCommands() + ";" + ";\n").getBytes(StandardCharsets.UTF_8));
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
