package dev.berto.rna.controller;

import dev.berto.rna.model.DNA;
import dev.berto.rna.model.DnaTranscriber;  
import dev.berto.rna.model.Transcriber;

public class TranscriberController {
    private final Transcriber transcriber;

    public TranscriberController() {
        this.transcriber = new DnaTranscriber();
    }
    
    public String transcribeController(String sequence) {
        return transcriber.transcribe(new DNA(sequence));
    }
}