package fr.hb;


import fr.hb.method.StringProcessor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println("Words count: " + StringProcessor.wordsCount("Combien de mots a t il ?"));

        // Test de reverser
        System.out.println("Reverser: " + StringProcessor.reverser("hello"));

        // Test de palindromic
        System.out.println("Palindromic: " + StringProcessor.palindromic("radar"));
    }
}