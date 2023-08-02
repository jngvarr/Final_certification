package Model;

public class Horses extends PackAnimals {

    public Horses() {
        this.ID = super.ID + "-" + PackAnimalType.H;
    }
    public Horses(String datum, String datum1, String datum2) {
        this();
        this.name=datum;
        this.dayOfBirth = datum1;
        this.commands = datum2;
    }
}

