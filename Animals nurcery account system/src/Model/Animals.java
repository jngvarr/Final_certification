package Model;

import java.time.LocalDate;

public  class Animals {
    static {
        Animals.number = 0;
    }

    protected static int number;
    protected String ID;
    private static AnimalsType type;
    protected String name;
    protected LocalDate dayOfBirth;
    protected String commands;

    public Animals(String type) {
        this.ID = String.format("#%s", ++Animals.number);
    }

    @Override
    public String toString() {
        return ID ;
    }
}


