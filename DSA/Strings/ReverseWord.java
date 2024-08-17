// Statement: Write a program to reverse a string with the order of words

package DSA.Strings;

import java.util.Scanner;

public class ReverseWord {

    public static String reverseWord(String str){
        String[] words = str.split(" ");
        String reversed = "";
        for(int i = words.length - 1; i >= 0; i--){
            reversed += words[i];
            reversed += " ";

        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        String result = reverseWord(str);
        System.out.println("Reversed string: " + result);
        sc.close();
    }
}
