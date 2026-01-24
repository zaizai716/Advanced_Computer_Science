public class Assignment {
    private String title;
    private String description;
    private int descriptionLength;

    public Assignment(String title, String description) {
        // Students: add your own validation and exceptions as you see fit

        // make sure title and description are NOT empty
        requireNotBlank(title);
        requireNotBlank(description);

        // make sure no profanity
        noProfanity(title);
        noProfanity(description);

        // make sure title and description length are reasonable
        checkTitleLength(title);
        checkDescriptionLength(description);

        // make sure there's no SQL injection attempts
        sqlSafe(title);
        sqlSafe(description);


        setTitle(title);
        setDescription(description);
    }

    public void setTitle(String title) {
        requireNotBlank(title);
        noProfanity(title);
        checkTitleLength(title);
        sqlSafe(title);


        this.title = title;
    }

    public void setDescription(String description) {
        requireNotBlank(description);
        noProfanity(description);
        checkDescriptionLength(description);
        sqlSafe(description);


        this.description = description;
        this.descriptionLength = (description == null) ? 0 : description.length();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDescriptionLength() {
        return descriptionLength;
    }

    private static void requireNotBlank(String s) {
        if (s == null) {
            throw new IllegalArgumentException(s + " is null.");
        }
        if (s.trim().isEmpty()) {
            throw new IllegalArgumentException(s + " is blank.");
        }
    }

    private static void noProfanity(String s) {
        if (s.toLowerCase() == "shit") {
            throw new IllegalArgumentException("No profanity! Try again without profanityl.");
        }
    }

    private static void checkTitleLength(String title) {
        if (title.length() > 100) {
            throw new IllegalArgumentException("Title exceeds character limit (100).");
        }
    }

    private static void checkDescriptionLength(String description) {
        if (description.length() > 500) {
            throw new IllegalArgumentException("Description exceeds character limit (500).");
        }
    }

    private static void sqlSafe(String s) {
        if (s.contains("'); DROP TABLE assignments; --")) {
            throw new IllegalArgumentException("No SQL injection! Try again.");
        }
    }

    

 
}
