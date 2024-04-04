import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Bag bag = new Bag(3);
        bag.add("Hello");
        bag.add(1);
        bag.add(true);
        System.out.println(bag.getElement(0));
        System.out.println(bag.remove());
        System.out.println(bag.getRandomElement());
    }
}
class Bag {
    private Object[] element;
    private int size = 0;
    Random random = new Random();

    public Bag(int size) {
        this.size = size;
        element = new Object[size];
    }

    public final void add(Object element) {
        this.element[random.nextInt(size)] = element;
    }

    public Object remove() {
        if (size > 0) {
            size--;
            return element[size];
        } else {
            return null;
        }
    }

    public Object getElement(int index) {
        return element[index];
    }

    public int getSize() {
        return size;
    }

    public Object getRandomElement() {

        return element[random.nextInt(size)];
    }
}
