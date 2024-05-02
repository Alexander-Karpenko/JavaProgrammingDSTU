class Person implements Contains<String> {
    private String surname;
    private int age;

    public Person(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean contains(String value) {
        return surname.equals(value);
    }

    @Override
    public String getKey() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

class PersonHashFunction extends HashFunction<String> {
    public PersonHashFunction(int size) {
        super(size);
    }

    @Override
    public int hash(String surname) {
        return Math.abs(surname.hashCode()) % size;
    }
}

public class Task10 {
    public static void main(String[] args) {
        HashTable<String, Person> hashTable = new HashTable<>(10, new PersonHashFunction(10));

        Person person1 = new Person("Ivanov", 30);
        Person person2 = new Person("Petrov", 35);
        Person person3 = new Person("Sidorov", 40);

        hashTable.insert(person1);
        hashTable.insert(person2);
        hashTable.insert(person3);
        System.out.println(person1.getKey());

        System.out.println("Searching for Ivanov: " + hashTable.search("Ivanov"));
        System.out.println("Searching for Petrov: " + hashTable.search("Petrov"));
        System.out.println("Searching for Sidorov: " + hashTable.search("Sidorov"));
        System.out.println("Searching for Kuznetsov: " + hashTable.search("Kuznetsov"));
    }
}
