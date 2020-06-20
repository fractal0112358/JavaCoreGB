import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList();
        words.add("Ivan");
        words.add("John");
        words.add("Mike");
        words.add("Denis");
        words.add("Ivan");
        words.add("Joseph");
        words.add("Alan");
        words.add("Gabe");
        words.add("Sage");
        words.add("Stephen");
        words.add("Richard");
        words.add("Mike");
        words.add("Andrew");
        System.out.println(words);
        printUnique(words);
        countNames(words);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Johnny", "8917569858");
        phoneBook.add("Johnny", "8917569859");
        phoneBook.add("Mike", "911");
        phoneBook.add("Mike", "9110");
        phoneBook.add("Sam", "404");
        phoneBook.add("Sam", "4040");
        phoneBook.get("Johny");
        phoneBook.get("Johnny");
        phoneBook.get("Mike");
        phoneBook.get("Mike1");
        phoneBook.get("Sam");
        phoneBook.get("Sam1");

    }

    public static void printUnique(ArrayList<String> words) {
        Set<String> uniqueWords = new HashSet();
        uniqueWords.addAll(words);
        System.out.println(uniqueWords.toString());
    }

    public static void countNames(ArrayList<String> words) {
        Map<String, Integer> mapCount = new HashMap();
        for (int i = 0; i < words.size(); i++) {
            mapCount.put(words.get(i), mapCount.getOrDefault(words.get(i), 0) +1);
        }
        System.out.println(mapCount);
    }
}
