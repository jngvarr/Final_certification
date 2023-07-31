package Model;

public class Horses extends PackAnimals {

    public Horses() {
        this.ID = super.ID + "-" + PackAnimalType.H;
    }
}

