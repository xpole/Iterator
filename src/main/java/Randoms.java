import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;
    private int max;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomImpl();
    }

    private class RandomImpl implements Iterator<Integer> {
        //Бесконечный итератор
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            random = new Random();
            return random.nextInt(max - min + 1) + min;
        }
    }
}