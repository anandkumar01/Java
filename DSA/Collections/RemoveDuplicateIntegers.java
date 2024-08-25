package DSA.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateIntegers {

    public static ArrayList<Integer> removeDuplicateIntegers(ArrayList<Integer> list) {

        HashSet<Integer> unique = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!unique.contains(list.get(i))) {
                unique.add(list.get(i));
                result.add(list.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of the list: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        ArrayList<Integer> ans = removeDuplicateIntegers(list);
        System.out.println("List after removing duplicates: " + ans);
        sc.close();
    }
}
