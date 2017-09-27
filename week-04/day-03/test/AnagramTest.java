import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    String str1 = "dog";
    String str2 = "god";
    Anagram doggod = new Anagram(str1, str2);

    @Test
    public void isReverse() throws Exception {
        assertTrue(doggod.isAnagram());
    }





}

