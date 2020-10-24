package nz.school.waimea;

/**
 * Utility class for output from the console
 */
public class ConsoleOutput {

    private static final String TOPBOT = "-";
    private static final String CORNER = "+";
    private static final String SIDE = "|";


    /**
     * Repeats a certain series of characters
     * a specified length of times
     *
     * @param text   character/text to repeat
     * @param length number of times to repeat character
     * @return the repeated string
     */
    private static String repeat( String text, int length ) {
        String result = "";

        for( int i = 0; i < length; i++ ) {
            result += text;
        }

        return result;
    }

    /**
     * Print a box around supplied text
     *
     * @param text the text to be surrounded
     */
    public static void printBoxed( String text ) {
        int length = text.length();

        System.out.println( CORNER + TOPBOT + repeat( TOPBOT, length ) + TOPBOT + CORNER );
        System.out.println( SIDE + " " + text + " " + SIDE );
        System.out.println( CORNER + TOPBOT + repeat( TOPBOT, length ) + TOPBOT + CORNER );
    }

    /**
     * Underline a supplied text
     *
     * @param text the text to be underlined
     */
    public static void printUnderlined( String text ) {
        int length = text.length();
        System.out.println( text );
        System.out.println( repeat( TOPBOT, length ) );

        System.out.println();
    }
}
