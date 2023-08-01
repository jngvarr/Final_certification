package Model;

import java.time.LocalDate;

public abstract class Animals {
    static {
        Animals.number = 0;
    }

    protected static int number;
    protected String ID;
    //    private static AnimalsType type;
    protected String name;
    protected LocalDate dayOfBirth;
    protected String commands;

    public Animals() {
        this.ID = String.format("#%s", ++Animals.number);
    }

    @Override
    public String toString() {
        return ID;
    }
}

public enum AnimalType {
    PACK,
    HOME;

    public static AnimalType getType(String type) {
        switch (type) {
            case "домашние":
                return AnimalType.HOME;
            case "вьючные":
                return AnimalType.PACK;
        }
        return null;
    }
}

