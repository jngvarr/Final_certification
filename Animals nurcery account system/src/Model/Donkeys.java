package Model;

public class Donkeys extends PackAnimals {

    public Donkeys() {
        this.ID = super.ID + "-" + PackAnimalType.D;
    }
}
