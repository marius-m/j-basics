package hangman;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * @author mariusmerkevicius
 * @since 2017-10-06
 */
public class WordPickerTest extends TestCase {

    public void testNoElements() throws Exception {
        try {
            ArrayList<String> lines = new ArrayList();
            WordPicker wordPicker = new WordPicker(lines);
            fail("No elements");
        } catch(Exception error) {
            assertEquals( "No elements", error.getMessage() );
        }
    }

    public void testNameValid() throws Exception {
        ArrayList<String> lines = new ArrayList();
        lines.add("Marius");
        lines.add("Jonas");
        lines.add("Petras");

        WordPicker wordPicker = new WordPicker(lines);

        String result = wordPicker.pick(0);

        assertEquals("Marius", result);
    }

    public void testNameValid1() throws Exception {
        ArrayList<String> lines = new ArrayList();
        lines.add("Marius");
        lines.add("Jonas");
        lines.add("Petras");
        WordPicker wordPicker = new WordPicker(lines);

        String result = wordPicker.pick(2);

        assertEquals("Petras", result);
    }

    public void testNameTooHigh() throws Exception {
        ArrayList<String> lines = new ArrayList();
        lines.add("Marius");
        lines.add("Jonas");
        lines.add("Petras");
        WordPicker wordPicker = new WordPicker(lines);

        String result = wordPicker.pick(10);

        assertEquals("Petras", result);
    }

    public void testNameTooLow() throws Exception {
        ArrayList<String> lines = new ArrayList();
        lines.add("Marius");
        lines.add("Jonas");
        lines.add("Petras");
        WordPicker wordPicker = new WordPicker(lines);

        String result = wordPicker.pick(-1);

        assertEquals("Marius", result);
    }
}