import java.util.HashSet;

import java.util.HashSet;

class HashSetDemo2 {
    // HashSet does not allow duplicates and does not guarantee the order in which
    // elements are added.
    void HashsetMethod() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("INDIA");
        hashSet.add("AUSTRALIA");
        hashSet.add("BANGLADESH");
        hashSet.add("CHINA");
        hashSet.add("DUBAI");
        hashSet.add("INDIA"); // Duplicate element, will be ignored.
        System.out.println(hashSet); // It will print elements in an unordered way.
    }
}

public class Demo32 {
    public static void main(String[] args) {
        HashSetDemo2 obj = new HashSetDemo2();
        obj.HashsetMethod();
    }
}