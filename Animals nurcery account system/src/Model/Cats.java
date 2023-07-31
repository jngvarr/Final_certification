package Model;

public class Cats extends Pet {

    public Cats() {
        this.ID = super.ID + "-" + PetType.C;
    }
}
