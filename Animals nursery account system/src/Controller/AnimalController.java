package Controller;

import Model.*;

import java.io.IOException;

public class AnimalController {


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
        new HomeAnimalRegistry().add(animal);

    }

    public void updateAnimalData(String id) {

    }

    public void deleteAnimal() {

    }

    public Animals getAllAnimals() {
        return null;
    }

    public void getAnimalByID() {

    }
}
