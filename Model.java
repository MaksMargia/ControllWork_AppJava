import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public interface Model {

    public static void WordCount() {  // Счетчик слов
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            int wordcount = 0;
            while (scanner.hasNext()) {
                scanner.next();
                wordcount++;
            }
            System.out.println("Количество слов в файле: " + wordcount);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
    }

    public static void LongestWordFinder() { // Нахождение самого длинного слова
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            String longestWord = "";
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            System.out.println("Самое длинное слово в файле: " + longestWord);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }

    }

    public static void WordFrequencyCounter() {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            Map<String, Integer> wordFrequency = new HashMap<>();
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
            wordFrequency.forEach((word, frequency) -> System.out.println(word + "       " + frequency));


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
    }
}
