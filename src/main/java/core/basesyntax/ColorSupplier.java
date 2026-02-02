package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        // Используем name() для получения строкового представления константы enum
        return colors[random.nextInt(colors.length)].name();
    }
}
