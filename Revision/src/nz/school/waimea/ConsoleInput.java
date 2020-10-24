package nz.school.waimea;

import java.util.Scanner;

/**
 * Utility class for input from the user
 */
public class ConsoleInput {

    private static final Scanner input = new Scanner( System.in );

    /**
     * Get an text input from the user
     *
     * @param prompt message to show the user
     * @return text user entered
     */
    public static String getText( String prompt ) {
        while( true ) {
            System.out.print( prompt + " " );

            String text = input.nextLine();

            if( !text.isBlank() ) {
                return text;
            }
        }
    }

    /**
     * Get an int from the user
     *
     * @param prompt message to show the user
     * @return the int value
     */
    public static int getInt( String prompt ) {
        while( true ) {
            System.out.print( prompt + " " );

            String text = input.nextLine();

            try {
                return Integer.parseInt( text );
            } catch( NumberFormatException e ) {
                // Things went wrong so ask again
            }
        }
    }
}
