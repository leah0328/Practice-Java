public class property {
    private double askingPrice;
    private String propertyType;
    private double lotSize;
    private int numBaths;
    private int numBeds;

    // land constructor
    public property(double askingPrice, String propertyType, double lotSize) {
        this.askingPrice = askingPrice;                 // this is the CONSTRUCTOR
        this.propertyType = propertyType;               // they have no return type, and will have the exact same name with the class
        this.lotSize = lotSize;                         // will be creating 2 CONSTRUCTOR for this example
        numBaths = 0;                                   // 1 for land (so no num of bed & bath),
        numBeds = 0;                                    // 1 for property with structure (with num of bed & bath)

    }

    //property CONSTRUCTOR
    public property(double askingPrice, String propertyType, double lotSize, int numBaths, int numBeds) {
        this.askingPrice = askingPrice;
        this.propertyType = propertyType;
        this.lotSize = lotSize;
        this.numBaths = numBaths;
        this.numBeds = numBeds;
    }

    // method (allow us to print the info nicely)
    public String toString() {
        return "Asking price: $" + askingPrice +
                "\nProperty type: " + propertyType +
                "\nLot size: " + lotSize +
                "\nNumber of baths: " + numBaths +
                "\nNumber of beds: " + numBeds;
    }
    //mutator method: modify the value of the attributes
    public void setAskingPrice(double newValue){
        askingPrice = newValue;
        }

}