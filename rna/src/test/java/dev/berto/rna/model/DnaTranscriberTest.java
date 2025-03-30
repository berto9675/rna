package dev.berto.rna.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DnaTranscriberTest {
    private final DnaTranscriber transcriber = new DnaTranscriber();

    @Test
    @DisplayName("Test to check the mapping of possible DNA strands")
    void mapTranscriptionTest() {
        Map<Character, Character> map = DnaTranscriber.getTranscriptionMap();

        assertEquals('C', map.get('G'));
        assertEquals('G', map.get('C'));
        assertEquals('A', map.get('T'));
        assertEquals('U', map.get('A'));
        assertNull(map.get('X'));
        assertNull(map.get(' '));
    }

    @Test
    @DisplayName("Test to verify that the interface is implemented")
    void transcriptionTest() {
        DNA sequence = new DNA("GCTA");
        assertEquals("CGAU", transcriber.transcribe(sequence));
    }
    
}
   
