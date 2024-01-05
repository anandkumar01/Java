/* Statement: You are given a row of doors, numbered from 1 to N. Initially, all the doors are closed.
              Your task is to simulate the opening and closing of doors based on the following pattern:
              1. For each pass, starting from the first door, you go through every ith door, where i is the pass number.
              2. If the door is closed, you open it and if it's open, you close it.
*/

package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoorOpenClose {
    public static List<List<Integer>> doorOpenClose(int n) {
        boolean[] res = new boolean[n];
        List<Integer> openDoor = new ArrayList<>();
        List<Integer> closeDoor = new ArrayList<>();
        for(int i=1; i <= n; i++) {
            int k = 1;
            while(k*i <= n) {
                int index = k*i - 1;
                res[index] = !res[index];
                k++;
            }
            if(res[i-1]){
                openDoor.add(i);
            } else{
                closeDoor.add(i);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(openDoor);
        result.add(closeDoor);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of doors:");
        int door = sc.nextInt();
        
        List<List<Integer>> result = doorOpenClose(door);
        System.out.println("The doors that are opened : " + result.get(0));
        System.out.println("The doors that are closed : " + result.get(1));
        sc.close();
    }
}