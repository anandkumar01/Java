package DSA.SearchingAlgorithms;

import java.util.Scanner;

public class SearchInString {
    public static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = sc.nextLine();
        System.out.println("Enter the character to search for: ");
        char target = sc.next().charAt(0);
        boolean result = search(string, target);
        if(result){
            System.out.println("The character is present in the string.");
        } else{
            System.out.println("The character is not present in the string.");
        }
        sc.close();
    }
}
