package module02.problem01;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Fruit apple = new Fruit("Apel", 0.4f, 7000.0f, 40.0f);
        Fruit mango = new Fruit("mangga", 0.2f, 3500.0f, 15.0f);
        Fruit avocado = new Fruit("alpukat", 0.25f, 10000.0f, 12.0f);

        apple.printInfo();
        mango.printInfo();
        avocado.printInfo();
    }
}