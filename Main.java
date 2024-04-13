import java.io.File;
import java.io.IOException;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        try {
            boolean work = true;
            Scanner scanner = new Scanner(System.in);
            while (work = true) {
                System.out.println("Введите одну из команд:\n" +
                        "1 - Подсчет слов.\n" +
                        "2 - Найти самое длинное слово.\n" +
                        "3 - Вычислить частоту повторения слов.\n" +
                        "4 - Выход.\n");
                String line = scanner.nextLine();
                switch (line) {
                    case "1":
                        Model.WordCount();
                        break;
                    case "2":
                        Model.LongestWordFinder();
                        break;
                    case "3":
                        Model.WordFrequencyCounter();
                        break;
                    case "4":
                        System.out.println("До встречи!");
                        work = false;
                        break;
                    default:
                }
            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}