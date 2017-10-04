package lt.vcs;

public class App16b {

    public static void main(String[] args) {
        WordUtility wordUtility = new WordUtility();
        String inputText = "The   quick   brown   fox    jumps over  the lazy dog";
        System.out.println("Sentence: " + inputText);
        System.out.println("Word count = " + wordUtility.wordCount(inputText));
    }
}
