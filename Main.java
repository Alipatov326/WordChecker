import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> words1 = new ArrayList<String>();
        WordChecker x = new WordChecker(words);
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(x.isWordChain());
        WordChecker w = new WordChecker(words1);
        words1.add("to");
        words1.add("too");
        words1.add("stool");
        words1.add("tools");
        System.out.println(w.isWordChain());
        ArrayList<String> words2 = new ArrayList<String>();
        WordChecker z = new WordChecker(words2);
        words2.add("catch");
        words2.add("bobcat");
        words2.add("catchacat");
        words2.add("cat");
        words2.add("at");
        System.out.println(z.createList("cat"));
        System.out.println(z.createList("catch"));
        System.out.println(z.createList("dog"));
    }


}
