import Controller.Counter;
import Model.*;
import View.UserMenu;
import Controller.Counter;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        new UserMenu().start();

    }
}