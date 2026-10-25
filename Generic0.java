
package generic0;
public class Generic0<T> 
{ protected T first, second;

public Generic0(T first, T second) {
    this.first = first;
    this.second = second;
}

public T getFirst() {
    return first;
}

public T getSecond() {
    return second;
}

public String toString() {
    return "[" + first + " | " + second + "]";
}
}
class NumberBox<T extends Number> extends Generic0<T> {

public NumberBox(T first, T second) {
    super(first, second);
}

public double sum() {
    return first.doubleValue() + second.doubleValue();
}
}

class Pair<K, V> { private K key; private V value;


public Pair(K key, V value) {
    this.key = key;
    this.value = value;
}

public K getKey() {
    return key;
}

public V getValue() {
    return value;
}

public class Generic0 {
    static double total(Box<? extends Number> b) { 
    double sum=b.getFirst().doubleValue() +b.getSecound().doubleValue();
   
}    

}

public static void main(String[] args) {
    Box<String> names = new Box<String>("sohaib", "Sara");
    System.out.println(names);

    Box<Integer> ints = new Box<Integer>(10, 20); // autoboxing
    int x = ints.getFirst(); // unboxing
    System.out.println(ints + " first = " + x);

    NumberBox<Double> prices = new NumberBox<Double>(12.5, 7.5);
    System.out.println("Sum = " + prices.sum());

    System.out.println("Total = " + total(ints));

    Pair<String, Integer> student = new Pair<String, Integer>("Ali", 90);
    System.out.println(student.getKey() + " got " + student.getValue());
}
}