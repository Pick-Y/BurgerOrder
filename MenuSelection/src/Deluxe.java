public class Deluxe extends Burger{

    private String item1;
    private String item2;
    private int price;

    public Deluxe(String breadType, String meat, int price) {
        super(breadType, meat, price);

        this.item1 = "Chips";
        this.item2 = "CocaCola";
        this.price = price;
    }

    @Override
    public String getMeat() {
        return super.getMeat();
    }

    @Override
    public void Total() {

       System.out.println("You pay: " + (price + 4));
    }
}
