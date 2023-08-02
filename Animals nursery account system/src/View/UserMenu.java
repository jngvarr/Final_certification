package View;

import Controller.Counter;
import Controller.AnimalController;
import Model.*;

import java.io.IOException;
import java.util.Scanner;

public class UserMenu {

    public void start() {
        System.out.println("start");
        Scanner sc = new Scanner(System.in);
        Counter count = new Counter();
        boolean end = false;
//        int choice;

        while (!end) {
            System.out.println(
                    "\n" +  "Выберите действие:\n" +
                            "1 - Список всех животных\n" +
                            "2 - Добавить новое животное\n" +
                            "3 - Корректировка существующих данных\n" +
                            "4 - Навыки животного\n" +
                            "5 - Дрессировка\n" +
                            "6 - Удалить запись\n" +
                            "0 - Выйти");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    try {
                        new AnimalController().createAnimal(animalChoose(animalTypeChoice()), newAnimalData());
                    } catch (NullPointerException | IOException e) {
                        System.out.println("Введенные данные некорректны" + e.getMessage());
                    }
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "0":
                    break;
            }
        }
    }

    private AnimalType animalTypeChoice() {
        AnimalType type = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Какое животное добавляем: \n" +
                "1 - Добавить домашнее животное.\n" +
                "2 - Добавить вьючное животное.\n" +
                "0 - Возврат в предыдущее меню. )");
        String choice;
        boolean end = false;
        AnimalType animalType;
        choice = sc.next();
        switch (choice) {
            case "1", "2":
                type = AnimalType.getType(choice);
                break;
            case "0":
                start();
        }
        return type;
    }

    private String animalChoose(AnimalType type) {
        Scanner sc = new Scanner(System.in);
        String choice;
        switch (type) {
            case HOME -> {
                System.out.println("Какое животное добавить: \n" +
                        "1 - Добавить кошку.\n" +
                        "2 - Добавить собаку.\n" +
                        "3 - Добавить хомяка.\n" +
                        "0 - Возврат в предыдущее меню. ");
                choice = sc.next();
                switch (choice) {
                    case "1":
                        return "cat";
                    case "2":
                        return "dog";
                    case "3":
                        return "hamster";
                    case "0":
                        animalTypeChoice();
                }
            }
            case PACK -> {
                System.out.println("Какое животное добавить: \n" +
                        "1 - Добавить верблюда.\n" +
                        "2 - Добавить осла.\n" +
                        "3 - Добавить лошадь.\n" +
                        "0 - Возврат в предыдущее меню. ");
                choice = sc.next();
                switch (choice) {
                    case "1":
                        return "camel";
                    case "2":
                        return "donkey";
                    case "3":
                        return "horse";
                    case "0":
                        animalTypeChoice();
                }
            }
        }
        return null;
    }

    private String[] newAnimalData() {
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
