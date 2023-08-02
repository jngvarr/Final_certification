package View;

import Controller.Counter;
import Model.*;

import java.util.Scanner;

public class UserMenu {

    public void start() {
        Scanner sc = new Scanner(System.in);
        Counter count = new Counter();
        boolean end = false;
//        int choice;

        while (!end) {
            System.out.println(
                    "\n" + "1 - Список всех животных\n" +
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
                    String animal = animalChoose(animalTypeChoice());
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
                return AnimalType.getType(choice);
            case "0":
                start();
        }
                return null;
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
                        "0 - Возврат в предыдущее меню. )");
                choice = sc.next();
                switch (choice) {
                    case "1":
                        return "cat";
                    case "2":
                        return "dog";
                    case "3":
                        return "hamster";
                }
            }
            case PACK -> {
                System.out.println("Какое животное добавить: \n" +
                        "1 - Добавить верблюда.\n" +
                        "2 - Добавить осла.\n" +
                        "3 - Добавить лошадь.\n" +
                        "0 - Возврат в предыдущее меню. )");
                choice = sc.next();
                switch (choice) {
                    case "1":
                        return "camel";
                    case "2":
                        return "donkey";
                    case "3":
                        return "horse";
                }
            }
        }
        return null;
    }
}
