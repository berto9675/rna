package dev.berto.rna.model;

public class DNA {
    private final String sequence;

    public DNA(String sequence) {
        if (sequence == null) {
            throw new IllegalArgumentException("Error in the sequence..");
        } else if (sequence.isBlank()) {
            throw new IllegalArgumentException("The DNA sequence cannot be empty.");
        }
        this.sequence = sequence;
    }
    public String getSequence() {
        return sequence;
    }

}
