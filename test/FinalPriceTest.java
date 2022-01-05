import com.company.FinalPrice;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinalPriceTest {
    FinalPrice testFinalPrice;

    @BeforeEach
    void setUp() {
    }

    @Test
    void bPN() {
        assertEquals(41.00, testFinalPrice.price(100.0, 10, "F"));
    }

    @AfterEach
    void tearDown() {
    }
}
