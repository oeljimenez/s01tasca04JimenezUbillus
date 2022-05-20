package it.academy.java.sprint1.tasca4.n1exercisi1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercisi1Test {

    @Test
     void testgenerateMonths() {
        Exercisi1 exercisi1 = new Exercisi1();
        List<String> months = exercisi1.generateMonths();
        assertEquals(12, months.size());
        assertNotNull(months);
        assertEquals("Agost", months.get(7));
    }

}