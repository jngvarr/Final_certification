package Controller;

import Model.*;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class AnimalController {
    RegistryController homeAnimalRegistry = new RegistryController();

    public void createAnimal(String type, String[] data) throws IOException {
        Animals animal = null;
        switch (type) {
            case "cat":
                animal = new Cats(data[0], data[1], data[2]);
                break;
            case "dog":
                animal = new Dogs(data[0], data[1], data[2]);
            case "hamster":
                animal = new Hamsters(data[0], data[1], data[2]);
                break;
            case "camel":
                animal = new Camels(data[0], data[1], data[2]);
                break;
            case "donkey":
                animal = new Donkeys(data[0], data[1], data[2]);
                break;
            case "horse":
                animal = new Horses(data[0], data[1], data[2]);
        }
        new Counter().add();
        homeAnimalRegistry.add(animal);

    }

    public void updateAnimalData() throws IOException {
        Scanner sc = new Scanner(System.in);
        getAllAnimals();
        System.out.println("Введите номер записи.");
        int noteNum = Integer.parseInt(sc.next());
        String[] newData = newAnimalData();
        homeAnimalRegistry.updateDB(newData, noteNum);
    }

    public void deleteAnimal() {

    }

    public void getAllAnimals() {
        List<String[]> animals;
        animals = homeAnimalRegistry.readDataFromFile("C:\\Users\\jngva\\gb\\Final_certification\\Animals nursery account system\\src\\Sources\\db.csv");
        System.out.println();
        if (animals.isEmpty()) System.out.println("Список пуст.");
        for (String[] strings : animals) {
            System.out.println(strings[0] + " " + strings[1] + " " + strings[2] + " " + strings[3] + " " + strings[4]);
        }
    }

    public String[] newAnimalData() {
        Scanner sc = new Scanner(System.in);
        String[] animalData = new String[3];
        System.out.print("Введите имя животного: \n> ");
        animalData[0] = sc.nextLine();
        System.out.print("Введите дату рождения животного(в формате гггг-мм-дд): \n> ");
        animalData[1] = sc.nextLine();
        System.out.print("Введите через запятую команды, которые знает животное: \n> ");
        animalData[2] = sc.nextLine();
        return animalData;
    }
}
