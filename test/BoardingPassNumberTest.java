import static org.junit.jupiter.api.Assertions.*;

import com.company.BoardingPassNumber;
import org.junit.jupiter.api.*;

public class BoardingPassNumberTest {
    BoardingPassNumber testBoardingPassNumber;

    @BeforeEach
    void setUp() {
    }

    @Test
    void bPN() {
        assertEquals("test1111202010", testBoardingPassNumber.bPN("test", 11, 11, 2020, 10.0));
    }

    @AfterEach
    void tearDown() {
    }

}
