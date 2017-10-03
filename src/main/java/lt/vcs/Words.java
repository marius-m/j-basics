package lt.vcs;

public class Words {

    public String joiner(String[] words) {
        String allWords = "";
        for (int i = 0; i < words.length; i++) {
            allWords += words[i];
        }
        return allWords;
    }

}
