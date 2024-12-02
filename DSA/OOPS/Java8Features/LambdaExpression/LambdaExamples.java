package DSA.OOPS.Java8Features.LambdaExpression;

// Without Lambda expressions
class ReverseStringImplementation implements StringOperation {

    @Override
    public String apply(String input) {
        return new StringBuilder(input).reverse().toString();
    }

}

public class LambdaExamples {

    public static void main(String[] args) {
        // Lambda Expression to reverse a string
        StringOperation reverse = input -> new StringBuilder(input).reverse().toString();

        // Lambda Expression to remove vowel from String
        StringOperation removeVowel = input -> input.replaceAll("[AEIOUaeiou]", "");

        // Lambda Expression to convert string into upper case
        StringOperation uppercase = input -> input.toUpperCase();

        String string = new String("Software Engineer");

        System.out.println("Original String: " + string);
        System.out.println("\nReverse : " + reverse.apply(string));
        System.out.println("Without vowels: " + removeVowel.apply(string));
        System.out.println("Upper Case: " + uppercase.apply(string));

    }
}
