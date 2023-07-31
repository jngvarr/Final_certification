package Controller;

public class Counter implements AutoCloseable {
    static int animalCount;

    static {
        animalCount = 0;
    }

    public void add() {
        animalCount++;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Counter closed");
    }
}
