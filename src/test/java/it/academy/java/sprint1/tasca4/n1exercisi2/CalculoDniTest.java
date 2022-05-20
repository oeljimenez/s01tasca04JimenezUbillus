package it.academy.java.sprint1.tasca4.n1exercisi2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {

    @Test
    void testCalculoDni() {

        CalculoDni calculoDni = new CalculoDni();

        List<String> dnis = new ArrayList<>();
        dnis.add("46466660H");
        dnis.add("11466660A");
        dnis.add("55466660X");
        dnis.add("46466660C");
        dnis.add("46786660S");
        dnis.add("46466660G");
        dnis.add("46444660H");
        dnis.add("46462560V");
        dnis.add("46464160M");
        dnis.add("26466660N");

        List<String> lletres = new ArrayList<>();
        lletres.add("H");
        lletres.add("A");
        lletres.add("X");
        lletres.add("C");
        lletres.add("S");
        lletres.add("G");
        lletres.add("H");
        lletres.add("V");
        lletres.add("M");
        lletres.add("N");

        for (int i = 0; i < dnis.size(); i++) {
            String lletraDni = calculoDni.calculLletraDni(dnis.get(i));
            assertEquals(lletres.get(i), lletraDni);
        }
    }

}