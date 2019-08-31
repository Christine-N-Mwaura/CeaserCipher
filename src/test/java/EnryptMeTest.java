import static org.junit.Assert.*;
import org.junit.*;

public class EnryptMeTest {
    @Test
    public void encodeMethod_keyOutOfBoundError_String() {
        EnryptMe testEncrypt = new EnryptMe();
        String resultExpected = "key must be between 1 to 25";
        assertEquals(resultExpected,testEncrypt.encodeMethod("here",27));

    }
    @Test
    public void encodeMethod_encryptLetter_String() {
        EnryptMe testEncrypt = new EnryptMe();
        String resultExpected = "Q";
        assertEquals(resultExpected,testEncrypt.encodeMethod("L",5));

    }
}