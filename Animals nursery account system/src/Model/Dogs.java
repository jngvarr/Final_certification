package Model;

import java.time.LocalDate;

public class Dogs extends Pet {

    public Dogs() {
        this.ID = super.ID+ "-" + PetType.D;
    }

    public Dogs(String datum, String datum1, String datum2) {
        this.ID = super.ID+ "-" + PetType.D;
        this.name=datum;
        this.dayOfBirth = datum1;
        this.commands = datum2;
    }
}

