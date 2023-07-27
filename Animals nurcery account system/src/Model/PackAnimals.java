package Model;

public abstract class PackAnimals extends Animals{

    public PackAnimals(String type) {
        super(type+"-P");
    }
}
enum PackAnimalType {
    H, // horses - лошади
    C, // camels - верблюды
    D; // donkeys - ослы

    public static PetType getType(String type) {
        switch (type) {
            case "верблюды":
                return PetType.C;
            case "лошади":
                return PetType.H;
            case "ослы":
                return PetType.D;
        }
        return null;
    }
}