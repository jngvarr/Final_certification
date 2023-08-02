import Model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cats cat = new Cats("Мурка", "2022-10-10", "взять");
        Dogs dog = new Dogs();
        Hamsters hamster = new Hamsters();
        Camels camel = new Camels();
        Donkeys donkey = new Donkeys();
        Horses horse = new Horses();

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(hamster);
        System.out.println(camel);
        System.out.println(donkey);
        System.out.println(horse);
        {
        }
    }
}