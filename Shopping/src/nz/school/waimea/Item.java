package nz.school.waimea;

public class Item {
    private String name;
    private int quantity;

    public Item( String name, int quantity ) throws IllegalArgumentException {
        setName( name );
        setQuantity( quantity );
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) throws IllegalArgumentException {
        if( name.isBlank() ) {
            throw new IllegalArgumentException( "Item name can't be blank" );
        }
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity( int quantity ) throws IllegalArgumentException {
        if( quantity < 1 ) {
            throw new IllegalArgumentException( "Item quantity must be one or more" );
        }
        this.quantity = quantity;
    }
}
