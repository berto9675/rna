package dev.berto.rna.model;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TranscriberTest {
@Test
    @DisplayName("Test to check if the interface exists")
    public void transcriberInterfaceTest() {
        assertDoesNotThrow(() -> {
            Transcriber.class.getMethod("transcribe", DNA.class);
        });
    }
}
