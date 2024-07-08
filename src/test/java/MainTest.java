import com.alisitsky.tasks.kyu6.FindOddAmountOfIntInArr;
import com.alisitsky.tasks.kyu6.WhichAreIn;
import com.alisitsky.tasks.kyu6.Xbonacci;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    private Xbonacci variabonacci;

    @BeforeEach
    public void setUp() throws Exception {
        variabonacci = new Xbonacci();
    }

    @AfterEach
    public void tearDown() throws Exception {
        variabonacci = null;
    }

    @Test
    public void basicTests() {
        assertArrayEquals(new double []{0,1,1,2,3,5,8,13,21,34}, variabonacci.xbonacci(new double []{0,1},10));
        assertArrayEquals(new double []{1,1,2,3,5,8,13,21,34,55}, variabonacci.xbonacci(new double []{1,1},10));
        assertArrayEquals(new double []{0,0,0,0,1,1,2,4,8,16}, variabonacci.xbonacci(new double []{0,0,0,0,1},10));
        assertArrayEquals(new double []{1,0,0,0,0,0,1,2,3,6}, variabonacci.xbonacci(new double []{1,0,0,0,0,0,1},10));
        assertArrayEquals(new double []{1,0,0,0,0,0,1,2,3,6}, variabonacci.xbonacci(new double []{1,0,0,0,0,0,1},10));
    }

    private void assertArrayEquals(double []expecteds, double[] actuals) {
        for(int i = 0; i < expecteds.length; i++)
            assertEquals(expecteds[i], actuals[i], 1e-10);
    }
}
