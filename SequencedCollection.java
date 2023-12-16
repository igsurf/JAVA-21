/**
 * SequenceCollection
 */
public class SequencedCollection {

    // Assume SequencedCollection is an interface in Java 21
    // and we have an implementation of it

    // Creating a SequencedCollection of integers
    SequencedCollection<Integer> numbers = new SequencedCollectionImplementation<>();numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(4);

    // Accessing the first and last elements
    Integer firstElement = numbers.getFirst();
    Integer lastElement = numbers.getLast();

    // Reversing the collection
SequencedCollection<Integer> reversedNumbers = numbers.reversed();

    // Iterating over the reversed collection
    for(
    Integer num:reversedNumbers)
    {
        System.out.println(num);
    }

}