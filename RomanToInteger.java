package pack2;
import java.util.*;
public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Roman number: ");
        String romanNumber = scanner.nextLine();
        int integerValue = romanToInteger(romanNumber);
        System.out.println("The integer value of the Roman number is: " + integerValue);
        scanner.close();
    }
    private static int romanToInteger(String romanNumber) {
        Map<Character, Integer> romanToIntegerMap = new HashMap<>();
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);
        int integerValue = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            char currentChar = romanNumber.charAt(i);
            int currentIntegerValue = romanToIntegerMap.get(currentChar);
            if (i + 1 < romanNumber.length() && romanToIntegerMap.get(romanNumber.charAt(i + 1)) > currentIntegerValue) {
                currentIntegerValue *= -1;
            }

            integerValue += currentIntegerValue;
        }
        return integerValue;
    }
}