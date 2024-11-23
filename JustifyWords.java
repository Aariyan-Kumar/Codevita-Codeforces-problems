import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JustifyWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of words
        int k = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // Input words
        List<String> words = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            String word = sc.nextLine();
            words.add(word);
        }

        // Input n (number of lines) and m (max line length)
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Filter out words that cannot fit on any line
        List<String> validWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() <= m) {
                validWords.add(word);
            }
        }

        // Solve using backtracking
        int result = maxWordsFitted(validWords, n, m, 0, new ArrayList<>());
        System.out.println(result);

        sc.close();
    }

    public static int maxWordsFitted(List<String> words, int n, int m, int index, List<String> lines) {
        // Base case: all words processed
        if (index == words.size()) {
            return lines.stream().mapToInt(line -> line.split(" ").length).sum();
        }

        int maxWords = 0;
        String word = words.get(index);

        // Try adding the word to an existing line
        for (int i = 0; i < lines.size(); i++) {
            String originalLine = lines.get(i);
            if (lines.get(i).length() + word.length() + (lines.get(i).isEmpty() ? 0 : 1) <= m) {
                // Add word to line with a space if needed
                lines.set(i, lines.get(i) + (lines.get(i).isEmpty() ? "" : " ") + word);
                maxWords = Math.max(maxWords, maxWordsFitted(words, n, m, index + 1, lines));
                // Backtrack
                lines.set(i, originalLine);
            }
        }

        // Try adding the word as a new line (if within line limit)
        if (lines.size() < n) {
            lines.add(word);
            maxWords = Math.max(maxWords, maxWordsFitted(words, n, m, index + 1, lines));
            // Backtrack
            lines.remove(lines.size() - 1);
        }

        return maxWords;
    }
}
