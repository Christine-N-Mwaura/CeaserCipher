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
    @Test
    public void encodeMethod_encryptWord_String() {
        EnryptMe testEncrypt = new EnryptMe();
        String resultExpected = "vguv";
        assertEquals(resultExpected,testEncrypt.encodeMethod("test",2));
    }
    @Test
    public void encodeMethod_encryptMixedLetterCase() {
        EnryptMe testEncrypt = new EnryptMe();
        String resultExpected = "IfmmP";
        assertEquals(resultExpected,testEncrypt.encodeMethod("HellO",1));
    }
    @Test
    public void encodeMethod_encryptOtherCharacter_String() {
        EnryptMe testEncrypt = new EnryptMe();
        String resultExpected = "If1mp45";
        assertEquals(resultExpected,testEncrypt.encodeMethod("He1lo45",1));

    }
}