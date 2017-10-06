package hangman;

import junit.framework.TestCase;

/**
 * @author mariusmerkevicius
 * @since 2017-10-06
 */
public class WordPickerRandomTest extends TestCase {

    public void testName() throws Exception {
        WordPicker wordPicker = new WordPicker();

        for (int i = 0; i < 10000; i++) {
            System.out.println(wordPicker.randomNumber());
        }
    }
}