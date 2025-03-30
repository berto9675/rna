package dev.berto.rna.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TranscriberControllerTest {
     private final TranscriberController controller = new TranscriberController();
    
    @Test
    @DisplayName("Test del controlador del transcriptor del ADN")
    public void transcribeTest() {
        assertEquals("CGAU", controller.transcribeController("GCTA"));
    }
}

