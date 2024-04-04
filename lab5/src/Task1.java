public class Task1<T, U> {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.make_pair(1, "Hello");
        System.out.println( pair.getFirst() + " " + pair.getSecond());

    }
}
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static <T, U> Pair<T, U> make_pair(T first, U second) {
        return new Pair<>(first, second);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

