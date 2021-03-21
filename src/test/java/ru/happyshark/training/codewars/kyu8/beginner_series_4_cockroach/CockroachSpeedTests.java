import org.junit.Test;
import ru.happyshark.training.codewars.kyu8.beginner_series_4_cockroach.Cockroach;

import static org.junit.Assert.assertEquals;

public class CockroachSpeedTests{
    @Test
    public void basicTests() throws Exception{
        Cockroach cockroach = new Cockroach();
        assertEquals(30, cockroach.cockroachSpeed(1.08));
        assertEquals(30, cockroach.cockroachSpeed(1.09));
        assertEquals(0, cockroach.cockroachSpeed(0));
    }
}