package lt.vcs;

public class WordUtility {

    public boolean isWordInside(String word, String wordToBeChecked) {
        return word.toLowerCase().contains(wordToBeChecked.toLowerCase());
    }

}
