package edu.io;

public abstract class Token {
    private final String label;
    public Token(String label) { this.label = label; }
    public String getLabel() { return label; }
}