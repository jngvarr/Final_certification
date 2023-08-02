package Model;

public class Dogs extends Pet {

    public Dogs() {
        this.ID = super.ID+ "-" + PetType.D;
    }

    public Dogs(String name, String dayOfBirth, String commands) {
        this();
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.commands = commands;
    }
}

