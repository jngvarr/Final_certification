package Model;

import java.time.LocalDate;

public class Hamsters extends Pet {

    public Hamsters() {
        this.ID = super.ID + "-" + PetType.H;
    }

    public Hamsters(String datum, String datum1, String datum2) {
        this.ID = super.ID + "-" + PetType.H;
        this.name=datum;
        this.dayOfBirth = datum1;
        this.commands = datum2;
    }
}

