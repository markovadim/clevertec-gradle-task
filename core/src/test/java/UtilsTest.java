import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"13", "43", "555", "1", "43"})
    void isAllPositiveNumbersShouldReturnTrue(String str) {
        assertTrue(Utils.isAllPositiveNumbers(str));
    }

    @Test
    void isAllPositiveNumbersShouldReturnFalse() {
        assertFalse(Utils.isAllPositiveNumbers("43", "54", "65", "-3"));
    }
}
