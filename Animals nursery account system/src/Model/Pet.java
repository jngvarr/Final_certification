package Model;

public abstract class Pet extends Animals {


    public Pet() {
        this.ID = super.ID + "-H";
    }

}

