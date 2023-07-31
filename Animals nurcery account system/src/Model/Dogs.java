package Model;

public class Dogs extends Pet {

    public Dogs() {
        this.ID = super.ID+ "-" + PetType.D;
    }
}

