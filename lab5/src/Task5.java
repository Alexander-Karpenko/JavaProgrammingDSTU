import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        GenericPairBag<Integer, String> genericPairBag = new GenericPairBag<>(1);
        genericPairBag.addPair(new Pair<>(1, "hello" ));
//        genericPairBag.addP(new Pair<>(1, " "));
//        genericPairBag.addP(new Pair<>( "22", "d"));
        System.out.println(genericPairBag.getElement(0));
    }
}
class GenericPairBag<T, U> extends PairBag{
    private ArrayList<Pair<T, U>> pairs;

    public GenericPairBag(int size) {
        super(size);
    }

    public void addPair(T first, U second) {
        Pair<T, U> pair = new Pair<>(first, second);
        pairs.add(pair);
    }

    public ArrayList<Pair<T, U>> getPairs() {
        return pairs;
    }
    @Override
    public Pair<T, T> getElement(int index) {
        return super.getElement(index);
    }

}