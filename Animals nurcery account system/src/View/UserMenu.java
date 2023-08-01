package View;

import java.util.Scanner;

import Controller.Counter;
import Model.AnimalType;

public class UserMenu {

    public void start() {
        Scanner sc = new Scanner(System.in);
        Counter count = new Counter();
        boolean end = false;
//        int choice;

        while (!end) {
            System.out.println(
                    "\n" +  "1 - Список всех животных\n" +
                            "2 - Завести новое животное\n" +
                            "3 - Корректировка существующих данных\n" +
                            "4 - Навыки животного\n" +
                            "5 - Дрессировка\n" +
                            "6 - Удалить запись\n" +
                            "0 - Выйти");
            String choice = sc.next();
            switch (choice){
                case "1": break;
                case "2":break;
                case "3":break;
                case "4":break;
                case "5":break;
                case "0":break;
            }
        }
        private AnimalType animalTypeChoice(){

        }
    }
}
