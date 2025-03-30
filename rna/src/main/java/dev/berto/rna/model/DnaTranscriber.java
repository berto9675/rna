package dev.berto.rna.model;

import java.util.Map;

public class DnaTranscriber implements Transcriber {
    private static final Map<Character, Character> TRANSCRIPTION_MAP = Map.of(
        'G', 'C', 'C', 'G', 'T', 'A', 'A', 'U'
    );

    public static Map<Character, Character> getTranscriptionMap() {
        return TRANSCRIPTION_MAP;
    }

    @Override
    public String transcribe(DNA sequence) {
        
        StringBuilder rna = new StringBuilder();
        
        for (char nucleotide : sequence.getSequence().toUpperCase().toCharArray()) {
            rna.append(TRANSCRIPTION_MAP.get(nucleotide));
        }
        
        return rna.toString();
    }
}


