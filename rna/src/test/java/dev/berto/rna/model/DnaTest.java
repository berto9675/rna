package dev.berto.rna.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class DNATest {
    @Test
    @DisplayName("Test to obtain the DNA sequence")
    public void getSequenceTest() {
        DNA sequence = new DNA("GCTA");

        assertEquals("GCTA", sequence.getSequence());
    }

    @Test
    @DisplayName("Test to verify that an empty sequence cannot be entered")
    public void emptySequenceTest() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new DNA(""));
        assertEquals("The DNA sequence cannot be empty.", exception.getMessage());
    }

    @Test
    @DisplayName("Test to verify that a null sequence cannot be entered")
    public void nullSequenceTest() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new DNA(null));
        assertEquals("Error in the sequence.", exception.getMessage());
    }
}

