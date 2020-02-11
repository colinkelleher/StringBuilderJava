import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is a simple Junit test for testing the Builder class
 *
 * @author Colin Kelleher_117303363
 * @version 1
 *
 */
public class test_builder {
    /**
     * Testing the append method within the Builder Class
     * Appending strings to the builder instance, and asserting
     * as to whether the string equals or doesn't
     */
    @Test
    public void test_appendToString(){
        Builder builder = new Builder();
        assertEquals("The string should be empty",builder.toString(), "");
        builder.append("Hello");
        assertEquals("Hello has been appended,so should equal Hello in this assert" +
                "",builder.toString(),"Hello");
        builder.append("Workplace Technologies");
        assertNotEquals(builder.toString(),"Workplace Tech");
    }
}
