package lt.vcs;

import junit.framework.TestCase;

/**
 * @author mariusmerkevicius
 * @since 2017-10-05
 */
public class GasTest extends TestCase {

    public void testName() throws Exception {
        Gas gas1 = new Gas("12", "100");
        double result = gas1.calculate();
        assertEquals(12.0, result);
    }

    public void testName2() throws Exception {
        Gas gas1 = new Gas("12", "120");
        double result = gas1.calculate();
        assertEquals(10.0, result);
    }
}