import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    Sum single = new Sum(4);
    Sum multiple = new Sum(30);
   // Sum empty = new Sum();
    Sum zero = new Sum(0);



    @Before
    public void setUp() throws Exception {
        single.addNum(4);
        multiple.addNum(3);
        multiple.addNum(4);
        multiple.addNum(6);
    }

    @After

    @Test
    public void testSingle() {
        assertEquals(4, single.addingUp());
    }





}