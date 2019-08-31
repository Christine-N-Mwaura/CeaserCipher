import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptMeTest {
    @Test
    public void decodeMethod_testLetterDecryption_String() {
        DecryptMe testDecrypt = new DecryptMe();
        String resultExpected = "H";
        assertEquals(resultExpected,testDecrypt.decodeMethod("I",1));
    }

    @Test
    public void decodeMethod_testSentenceDecryption_String() {
        DecryptMe testDecrypt = new DecryptMe();
        String resultExpected = "This is My Message";
        assertEquals(resultExpected,testDecrypt.decodeMethod("Vjku ku Oa Oguucig",2));
    }

}
