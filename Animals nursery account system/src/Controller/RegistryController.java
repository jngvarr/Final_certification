package Controller;

import Model.Animals;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class RegistryController {
    String path = "C:\\Users\\jngva\\gb\\Final_certification\\Animals nursery account system\\src\\Sources";
    boolean bdIsEmpty = false;

    public void updateDB(String[] data, int noteNumber) throws IOException {
        List<String[]> list = readDataFromFile(path + "\\db.csv");
        list.get(noteNumber)[2]=data[0];
        list.get(noteNumber)[3]=data[1];
        list.get(noteNumber)[4]=data[2];
        writeDataToFile(list, path);
    }

    public void setID() {
        int lastNum = 0;
        List<String[]> list = readDataFromFile(path + "\\db.csv");
        if (!list.isEmpty()) lastNum = Integer.parseInt(list.get(list.size() - 1)[0]);
//        if (Animals.getNumber() > lastNum)
        Animals.setNumber(lastNum);
    }

    public void add(Animals animal) throws IOException {
        List<String[]> list = readDataFromFile(path + "\\db.csv");
        if (list.isEmpty()) bdIsEmpty = true;
        list.add(new String[]{animal.getID().substring(animal.getID().indexOf("#") + 1, animal.getID().indexOf("-")),
                animal.getID(), animal.getName(), animal.getDayOfBirth(), animal.getCommands()});
        writeDataToFile(list, path);
    }

    public List<String[]> readDataFromFile(String path) {
        List<String[]> list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(path), StandardCharsets.UTF_8)) {
            while (sc.hasNextLine()) {
                list.add(sc.nextLine().split(";"));
            }
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

//    public void writeAnimalDataToFile(List<Animals> animalsList, String path) throws IOException {
//        OutputStream outStream = new FileOutputStream(path + "\\db.csv");
//        String titles = "N;ID;Name;Day_of_birth;Commands\n";
//        outStream.write(titles.getBytes(StandardCharsets.UTF_8));
//        for (Animals animal : animalsList) {
//            outStream.write((animal.getID().substring(animal.getID().indexOf("#") + 1, animal.getID().indexOf("-")) + ";" + animal.getID() + ";"
//                    + animal.getName() + ";" + animal.getDayOfBirth() + ";" + animal.getCommands() + ";" + ";\n").getBytes(StandardCharsets.UTF_8));
//        }
//        outStream.close();
//    }

    public void writeDataToFile(List<String[]> animalList, String path) throws IOException {
        OutputStream outStream = new FileOutputStream(path + "\\db.csv");
        if (bdIsEmpty) {
            String titles = "N;ID;Name;Day_of_birth;Commands\n";
            outStream.write(titles.getBytes(StandardCharsets.UTF_8));
            bdIsEmpty = false;
        }
        for (String[] animal : animalList) {
            outStream.write((animal[0] + ";" + animal[1] + ";" + animal[2] + ";" + animal[3] + ";" + animal[4] + ";\n").getBytes(StandardCharsets.UTF_8));
        }
        outStream.close();
    }
}
