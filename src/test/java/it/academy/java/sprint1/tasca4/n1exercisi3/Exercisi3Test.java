package it.academy.java.sprint1.tasca4.n1exercisi3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Exercisi3Test {

    @Test
    void testArrayIndexOutOfBoundsException() {
        Exercisi3 exercisi3 = new Exercisi3();

        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                exercisi3.generateException());
        assertEquals("5", exception.getMessage());
    }

}