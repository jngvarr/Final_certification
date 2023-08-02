package Model;

import java.time.LocalDate;

public class Cats extends Pet {

    public Cats() {
        this.ID = super.ID + "-" + PetType.C;
    }

    public Cats(String name, String dayOfBirth, String commands) {
        this();
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.commands = commands;
    }
}
