import java.util.ArrayList;


//JEP 431
public class SequencedCollection<T> {
    private ArrayList<T> collection;

    public SequencedCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(T element) {
        this.collection.add(element);
    }

    public T getFirst() {
        if (!this.collection.isEmpty()) {
            return this.collection.get(0);
        }
        return null;
    }

    public T getLast() {
        if (!this.collection.isEmpty()) {
            return this.collection.get(this.collection.size() - 1);
        }
        return null;
    }

    public SequencedCollection<T> reversed() {
        SequencedCollection<T> reversedCollection = new SequencedCollection<>();
        for (int i = this.collection.size() - 1; i >= 0; i--) {
            reversedCollection.add(this.collection.get(i));
        }
        return reversedCollection;
    }

    public static void main(String[] args) {
        SequencedCollection<Integer> collection = new SequencedCollection<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);

        System.out.println(collection.getFirst());
        System.out.println(collection.getLast());

        SequencedCollection<Integer> reversedCollection = collection.reversed();
        System.out.println(reversedCollection.getFirst());
        System.out.println(reversedCollection.getLast());
    }
}