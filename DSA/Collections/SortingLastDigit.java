// Sorting the numbers based on their last digit.

package DSA.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingLastDigit {
    public static void main(String[] args) {

        // Creating a Comparator to compare integers based on their last digit
        Comparator<Integer> comparator = new Comparator<Integer>() {

            // Override the compare method to compare last digits of integers
            public int compare(Integer i, Integer j) {

                // Compare last digits of i and j
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        // Create a list of integers
        List<Integer> list = new ArrayList<>();
        // Add integers to the list
        list.add(123);
        list.add(456);
        list.add(781);
        list.add(352);
        System.out.println("Before sorting: " + list);

        // Sort the list using the custom comparator
        Collections.sort(list, comparator);
        System.out.println("After sorting: " + list);
    }
}
