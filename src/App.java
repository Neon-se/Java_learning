import java.util.Scanner;

public class App {
    private static final String[] wordList = new String[] {"собака", "энцефалит", "здание", "апостроф", "траспорт", "автобус", "штаб-квартира"};
    private static final String word = wordList[(int)Math.floor(Math.random()*wordList.length)];
    public static void main(String[] args ) {
        Scanner in = new Scanner(System.in);
        int marks = 0;
        int len = word.length();
        System.out.printf("Привет! Ты должен отгадать слово, в нём %d букв...\n", len);

        StringBuilder strBuild = new StringBuilder();

        for (int i = 0; i < len; i++) {
            if(Character.isLetter(word.charAt(i))) {
                strBuild.append("_");
            } else {
                strBuild.append(word.charAt(i));
            }
        }
        String wordMask = strBuild.toString();

        System.out.println(wordMask);

        do {
            System.out.print("Введите букву: ");
            char c = in.next().charAt(0);
            if(Character.isLetter(c)) {
                if (wordMask.indexOf(c) >= 0) {
                    System.out.println("Ты уже ввёл " + c);
                } else if (word.indexOf(c) >= 0) {
                    for (int i = 1; i <= len; i++) {
                        if (word.charAt(i - 1) == c) {
                            wordMask = wordMask.substring(0, i - 1) + c + wordMask.substring(i, len);
                        }
                    }
                    System.out.printf("Такая буква есть: %s\n", wordMask);
                } else {
                    System.out.println("Неправильная буква!");
                    marks++;
                }
            }
        } while (!wordMask.equals(word));
        System.out.printf("Угадал! Ошибок: %d", marks);
    }
}
