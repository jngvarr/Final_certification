package Model;

public class Donkeys extends PackAnimals {

    public Donkeys() {
        this.ID = super.ID + "-" + PackAnimalType.D;
    }
    public Donkeys(String datum, String datum1, String datum2) {
        this();
        this.name=datum;
        this.dayOfBirth = datum1;
        this.commands = datum2;
    }
}
