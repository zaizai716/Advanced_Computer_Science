public class Word {
    private String originalWord;
    private String sortedWord;

    public Word(String originalWord) {
        if (originalWord == null || !originalWord.matches("[A-Za-z]+")) {
            throw new IllegalArgumentException("Word must contain letters only.");
        }
        this.originalWord = originalWord;
        this.sortedWord = sortWord();
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public String getSortedWord() {
        return sortedWord;
    }

    public String sortWord() {
        char[] letters = originalWord.toLowerCase().toCharArray();

        // Selection sort
        for (int i = 0; i < letters.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < letters.length; j++) {
                if (letters[j] < letters[minIndex]) {
                    minIndex = j;
                }
            }

            char temp = letters[i];
            letters[i] = letters[minIndex];
            letters[minIndex] = temp;
        }

        return new String(letters);
    }

    public String toString() {
        return originalWord;
    }
}
