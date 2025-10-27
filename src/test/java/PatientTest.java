package com.meditrack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

    @Test
    void testPatientName() {
        Patient p = new Patient("Norma Roth");
        assertEquals("Norma Roth", p.getName(), "Name sollte korrekt gesetzt sein");
    }

    @Test
    void testPatientAge() {
        Patient p = new Patient("Max Mustermann", 30);
        assertEquals(30, p.getAge(), "Alter sollte korrekt gesetzt sein");
    }
}
