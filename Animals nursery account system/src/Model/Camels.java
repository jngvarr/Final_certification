package Model;

public class Camels extends PackAnimals {

    public Camels() {
        this.ID = super.ID + "-" + PackAnimalType.C;
    }
    public Camels(String datum, String datum1, String datum2) {
        this();
        this.name=datum;
        this.dayOfBirth = datum1;
        this.commands = datum2;
    }
}
