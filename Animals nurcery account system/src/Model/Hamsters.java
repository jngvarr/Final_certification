package Model;

public class Hamsters extends Pet {

    public Hamsters() {
        this.ID = super.ID + "-" + PetType.H;
    }
}

