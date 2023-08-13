import java.util.Scanner;

public class task_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку из слов, разделенных пробелами: ");
        String inputString = scanner.nextLine();

        String[] words = inputString.split("\\s+");

        int latinWordsCount = 0;

        for (String word : words) {
            if (isLatin(word)) {
                System.out.println(word);
                latinWordsCount++;
            }
        }

        System.out.println("Количество слов на латинице: " + latinWordsCount);
    }

    private static boolean isLatin(String word) {
        return word.matches("[a-zA-Z]+");
    }
}