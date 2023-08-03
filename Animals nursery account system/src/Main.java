import Controller.Counter;
import Model.*;
import View.UserMenu;
import Controller.Counter;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

//        Cats cat = new Cats("Мурка", "2022-10-10", "взять");
//        Dogs dog = new Dogs("Шарик","2023-01-01","фас");
//        Hamsters hamster = new Hamsters();
//        Camels camel = new Camels();
//        Donkeys donkey = new Donkeys();
//        Horses horse = new Horses();
//
//        System.out.println(cat);
//        System.out.println(dog);
//        System.out.println(hamster);
//        System.out.println(camel);
//        System.out.println(donkey);
//        System.out.println(horse);
//
//
//        System.out.println(Counter.getAnimalCount());
//        new Counter().add();
//        System.out.println(Counter.getAnimalCount());
        new UserMenu().start();
        Path currentRelativePath = Paths.get("");
        System.out.println(currentRelativePath.toAbsolutePath());
      System.out.println(System.getProperty("user.dir"));
    }
}