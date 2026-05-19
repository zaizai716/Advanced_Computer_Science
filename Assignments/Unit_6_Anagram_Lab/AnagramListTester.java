public class AnagramListTester {
    public static void main(String[] args) {
        AnagramList words = new AnagramList();
        words.add(new Word("cinema"));
        words.add(new Word("iceman"));
        words.add(new Word("silent"));
        words.add(new Word("listen"));
        words.add(new Word("enlist"));
        words.add(new Word("stone"));
        words.add(new Word("notes"));

        String key = "tinsel";
        System.out.println("Searching for anagrams of: " + key);
        System.out.println(words.searchAnagrams(key));
    }
}
