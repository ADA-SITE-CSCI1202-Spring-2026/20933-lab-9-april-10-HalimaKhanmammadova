public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    public static <K, V> Pair<K, V> of(K key, V value) {
        return new Pair<>(key, value);
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Alice", 30);
        System.out.println("Pair 1: " + p1);

        Pair<Double, Boolean> p2 = Pair.of(3.14, true);
        System.out.println("Pair 2: " + p2);

        p1.setValue(31);
        System.out.println("Updated: " + p1);
    }
}