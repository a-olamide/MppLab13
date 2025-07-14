package lesson11.labs.prob2;

import java.util.Arrays;
import java.util.List;

public class FindSecondSmallest {
    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("Less than 2 elements not allowed");
        }

        T smallest = null;
        T secondSmallest = null;

        for (T item : list) {
            if (smallest == null || item.compareTo(smallest) < 0) {
                secondSmallest = smallest;
                smallest = item;
            } else if (!item.equals(smallest) && (secondSmallest == null || item.compareTo(secondSmallest) < 0)) {
                secondSmallest = item;
            }
        }

        if (secondSmallest == null) {
            throw new IllegalArgumentException("List does not contain two distinct elements");
        }

        return secondSmallest;
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(4,6,8,10,5);
        System.out.println("Second smallest (Integer): " + secondSmallest(intList)); // 5

        List<String> stringList = Arrays.asList("apple","banana","mango","orange","guava");
        System.out.println("Second smallest (String): " + secondSmallest(stringList)); // banana

        List<Double> doubleList = Arrays.asList(5.6,4.6,7.8,7.9);
        System.out.println("Second smallest (Double): " + secondSmallest(doubleList)); // 2.0
    }
}
