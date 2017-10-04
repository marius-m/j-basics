package lt.vcs;

public class WordUtility {

    public int numberOfExecutions = 0;

    public boolean isWordInside(String word, String wordToBeChecked) {
        numberOfExecutions ++;
        return word.toLowerCase().contains(wordToBeChecked.toLowerCase());
    }

    public int wordCount(String sentence) {
        int wordCount = 0;
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            // words[i].length() == 0
            // words[i].isEmpty()
            if (!words[i].equals("")) {
                wordCount++;
            }
        }
        return wordCount;
    }

}
