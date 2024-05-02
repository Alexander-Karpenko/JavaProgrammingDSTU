import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        DList<Integer, Integer> dList = new DList<>();

        dList.add(1, List.of(1));
        dList.add(2, List.of(1, 1));
        dList.add(3, List.of(1, 2));
        dList.add(4, List.of(1, 3, 2, 2));
        dList.add(5, List.of(2, 3));

        System.out.println("Значение в позиции 2: " + dList.getValue(2));
        System.out.println("Список значений в позиции 2: " + dList.getValues(2));

        dList.removeByIndex(1);
        System.out.println("Значение в позиции 1 после удаления: " + dList.getValue(1));
        System.out.println("Список значений в позиции 1 после удаления: " + dList.getValues(1));

        dList.removeByValue(2);
        System.out.println("Значение 3 после удаления: " + dList.getValueByValue(3));
        System.out.println("Список значений для значения 3 после удаления: " + dList.getValuesByValue(3));
    }
}
class DList<T1, T2> {
    private List<T1> list1;
    private List<List<T2>> list2;

    public DList() {
        this.list1 = new ArrayList<>();
        this.list2 = new ArrayList<>();
    }

    public void add(T1 value, List<T2> values) {
        list1.add(value);
        list2.add(values);
    }

    public void removeByIndex(int index) {
        if (index >= 0 && index < list1.size()) {
            list1.remove(index);
            list2.remove(index);
        }
    }

    public void removeByValue(T1 value) {
        int index = list1.indexOf(value);
        if (index != -1) {
            list1.remove(index);
            list2.remove(index);
        }
    }

    public T1 getValue(int index) {
        return list1.get(index);
    }

    public List<T2> getValues(int index) {
        return list2.get(index);
    }

    public T1 getValueByValue(T1 value) {
        int index = list1.indexOf(value);
        return list1.get(index);
    }

    public List<T2> getValuesByValue(T1 value) {
        int index = list1.indexOf(value);
        return list2.get(index);
    }

    @Override
    public String toString() {
        return "DList{" +
                "list1=" + list1 +
                ", list2=" + list2 +
                '}';
    }
}
