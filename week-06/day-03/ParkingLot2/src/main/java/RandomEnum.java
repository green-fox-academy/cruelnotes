import java.util.Random;

public class RandomEnum<E extends Enum> {

    private static final Random RND = new Random();
    private final E[] values;

    public RandomEnum(Class<E> token) {
        values = token.getEnumConstants();
    }

    public E randomValue() {
        return values[RND.nextInt(values.length)];
    }

}