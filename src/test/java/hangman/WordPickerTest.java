package hangman;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * @author mariusmerkevicius
 * @since 2017-10-06
 */
public class WordPickerTest extends TestCase {

    public void testNameValid() throws Exception {
        ArrayList<String> lines = new ArrayList();
        lines.add("Marius");
        lines.add("Jonas");
        lines.add("Petras");

        WordPicker wordPicker = new WordPicker(lines);

    }
}