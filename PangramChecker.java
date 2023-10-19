package pack2;
import java.util.HashSet;
import java.util.Set;
public class PangramChecker {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog"; 
        System.out.println(isPangram(sentence));
    }
    public static boolean isPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char c : sentence.toUpperCase().toCharArray()) {
            if (Character.isAlphabetic(c)) {
                alphabetSet.add(c);
            }
        }
        return alphabetSet.size() == 26;
    }
}

