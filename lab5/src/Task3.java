public class Task3 {
    public static void main(String[] args) {
        PairBag pairBag = new PairBag(3);
        pairBag.add(new Pair( 1, "One"));
        pairBag.add(new Pair( 2, false));
        System.out.println(pairBag.getElement(0));
        System.out.println(pairBag.remove());

    }
}
class PairBag extends Bag{
    public PairBag(int size) {
        super(size);
    }

    public final void addPair(Pair pair) {
        super.add(pair);
    }

    @Override
    public Pair remove() {
        return (Pair) super.remove();
    }

    @Override
    public Pair getElement(int index) {
        return (Pair) super.getElement(index);
    }


    @Override
    public Pair getRandomElement() {
        return (Pair) super.getRandomElement();
    }
}
