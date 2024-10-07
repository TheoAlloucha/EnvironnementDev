package fr.hb.method;

/**
 * Classe utilitaire pour le traitement de chaînes de caractères.
 */
public final class StringProcessor {
    // Constructeur privé pour empêcher l'instanciation
    private StringProcessor() {
        throw new UnsupportedOperationException(
                "Cette classe ne doit pas être instanciée"
        );
    }

    /**
     * Compte le nombre de mots dans une phrase donnée.
     *
     * @param sentence La phrase à analyser.
     * @return Le nombre de mots dans la phrase.
     */
    public static int wordsCount(final String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    /**
     * Inverse un mot donné.
     *
     * @param word Le mot à inverser.
     * @return Le mot inversé.
     */
    public static String reverser(final String word) {
        return new StringBuilder(word).reverse().toString();
    }

    /**
     * Vérifie si un mot est un palindrome.
     *
     * @param word Le mot à vérifier.
     * @return {@code true} si le mot est un palindrome, sinon {@code false}.
     */
    public static boolean palindromic(final String word) {
        return word.equalsIgnoreCase(reverser(word));
    }
}
