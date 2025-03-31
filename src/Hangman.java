public class Hangman {
    public static String man(int wrongGuess){
        String man = "";
        switch (wrongGuess){
            case 0 -> man = """
                    
                    """;
            case 1 -> man ="""
                     o
                    
                    
                    """;
            case 2 -> man =
                    """
                     o
                    /
                    
                    """;
            case 3 -> man =
                    """
                     o
                    /|
                    
                    """;
            case 4 -> man =
                    """
                     o
                    /|\\
                    
                    """;
            case 5 -> man =
                    """
                     o
                    /|\\
                    / 
                    """;
            case 6 -> man =
                    """
                     o
                    /|\\
                    / \\
                    """;
        }
        return man;
    }
}
