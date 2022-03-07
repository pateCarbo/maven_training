import fr.lernejo.Sample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void op_add() {
        int expected = 3;
        int actual = new Sample().op(Sample.Operation.ADD, 1, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void op_mult() {
        int expected = 42;
        int actual = new Sample().op(Sample.Operation.MULT, 6, 7);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void fact_0() {
        int expected = 1;
        int actual = new Sample().fact(0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fact_5() {
        int expected = 120;
        int actual = new Sample().fact(5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fact_neg() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            new Sample().fact(-2);
        });
        Assertions.assertEquals("N should be positive", exception.getMessage());
    }
}
