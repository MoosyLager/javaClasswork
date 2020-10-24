package nz.school.waimea;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Item> shoppingList = new ArrayList<>();

    public static void main( String[] args ) {

        shoppingList.add( new Item( "Egg", 40 ) );
        shoppingList.add( new Item( "TPapps", 1 ) );
        shoppingList.add( new Item( "AR-15", 123 ) );
        shoppingList.add( new Item( "Bacon", 9 ) );
        shoppingList.add( new Item( "Strong Rope", 1 ) );
        shoppingList.add( new Item( "Wine", 3 ) );

        while( true ) {
            ConsoleOutput.printUnderlined( "Menu Options" );
            System.out.println( "[V]iew List" );
            System.out.println( "[C]Clear List" );
            System.out.println( "[A]dd to List" );
            System.out.println( "Go [S]hopping" );
            System.out.println( "[Q]uit" );

            char choice = ConsoleInput.getText( "Your choice: " ).toLowerCase().charAt( 0 );

            if( choice == 'v' ) viewList();
            else if( choice == 'c' ) shoppingList.clear();
            else if( choice == 'a' ) addItems();
            else if( choice == 's' ) goShopping();
            else if( choice == 'q' ) break;

        }

    }

    private static void viewList() {
        ConsoleOutput.printUnderlined( "View List" );

        if( shoppingList.size() == 0 ) {
            System.out.println( "There's nothing here!" );
        } else {

            for( int i = 0; i < shoppingList.size(); i++ ) {
                Item item = shoppingList.get( i );

                System.out.printf( "%d %s %-20s %d %n", i + 1, ".", item.getName(), item.getQuantity() );
            }
        }
        System.out.println();
    }

    private static void addItems() {
        ConsoleOutput.printUnderlined( "Add Items to List" );

        // Get item data
        String name = ConsoleInput.getText( "Item name:" );
        int quantity = ConsoleInput.getInt( "Quantity:" );

        // Create a new item object
        Item item = new Item( name, quantity );

        // Add it to the list
        shoppingList.add( item );
    }

    private static void goShopping() {
        ConsoleOutput.printUnderlined( "Let's go Shopping!" );

        while( true ) {
            if( shoppingList.size() == 0 ) {
                System.out.println( "Nothing here to get!" );
                System.out.println();
                break;
            }

            viewList();

            System.out.println();
            int itemIndex = ConsoleInput.getInt( "What item would you like remove? (Number)" );
            System.out.println();

            if( itemIndex <= 0 || itemIndex > shoppingList.size() ) {
                System.out.println( "Sorry but the number should be between 1 and " + shoppingList.size() );
                System.out.println();
            } else {
                shoppingList.remove( itemIndex - 1 );
            }
        }
    }
}
