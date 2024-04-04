public class Task4 {
public static void main(String[] args) {
    GPairBag<Integer, String> gPairBag = new GPairBag<>(3);
    gPairBag.addP(new Pair<>(1, "hello"));
//        genericPairBag.addP(new Pair<>(1, " "));
//        genericPairBag.addP(new Pair<>( "22", "d"));
    System.out.println(gPairBag.getElement(0));
}
}
class GPairBag<T, U> extends PairBag{

    public GPairBag(int size) {
        super(size);
    }

    public final void addP(Pair<T, U> pair) {
        super.add(pair);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public Pair<T, T> remove() {
        return super.remove();
    }

    @Override
    public Pair<T, T> getElement(int index) {
        return super.getElement(index);
    }

    @Override
    public Pair<T, T> getRandomElement() {
        return super.getRandomElement();
    }

}
