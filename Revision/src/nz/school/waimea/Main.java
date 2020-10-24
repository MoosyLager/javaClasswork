package nz.school.waimea;


public class Main {


    public static void main( String[] args ) {
        ConsoleOutput.printUnderlined( "Hello, World!" );

        String name = ConsoleInput.getText( "Enter your name:" );
        ConsoleOutput.printBoxed( "Hello, " + name );

        int age = ConsoleInput.getInt( "Enter your name:" );
        ConsoleOutput.printBoxed( "You are " + age + " years old" );
    }
}
