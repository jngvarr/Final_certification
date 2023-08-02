package Model;

public abstract class Animals {
    static {
        Animals.number = 0;
    }

    protected static int number;
    protected String ID;
    protected String name;
    protected String dayOfBirth;
    protected String commands;

    public Animals() {
        this.ID = String.format("#%s", ++Animals.number);
    }
    public Animals(String name, String dayOfBirth, String commands) {
        this.ID = String.format("#%s", ++Animals.number);
        this.name=name;
        this.dayOfBirth = dayOfBirth;
        this.commands = commands;
    }


    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public String getCommands() {
        return commands;
    }

    @Override
    public String toString() {
        return (ID +" "+ name +" "+ dayOfBirth +" "+ commands);
    }
}

