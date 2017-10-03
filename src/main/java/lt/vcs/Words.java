package lt.vcs;

public class Words {

    public String joiner(String startsWith, String[] words) {
        String allWords = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(startsWith)) {
                allWords += words[i];
            }
        }
        return allWords;
    }

}

