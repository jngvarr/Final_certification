package Model;

import java.time.LocalDate;

public class Donkeys extends PackAnimals {

    public Donkeys() {
        this.ID = super.ID + "-" + PackAnimalType.D;
    }
    public Donkeys(String datum, String datum1, String datum2) {
        this.ID = super.ID+ "-" + PetType.D;
        this.name=datum;
        this.dayOfBirth = datum1;
        this.commands = datum2;
    }
}
