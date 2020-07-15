import junit.framework.TestCase;
import org.junit.Test;

public class TESTTest extends TestCase {
    @Test
    public void isLeapYear1() {
        int number = 2012;
        boolean expected = true;
        boolean result = TEST.isLeapYear(number);
        assertEquals(true, result);
    }
    @Test
    void isLeapYear2() {
        int number = 2010;
        boolean expected = false;
        boolean result = TEST.isLeapYear(number);
        assertEquals(false, result);
    }
}