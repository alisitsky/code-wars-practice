import com.alisitsky.tasks.kyu6.FindOddAmountOfIntInArr;
import com.alisitsky.tasks.kyu6.WhichAreIn;
import com.alisitsky.tasks.kyu6.Xbonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void test1() {
        String a[] = new String[]{  "live", "arp", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
}
