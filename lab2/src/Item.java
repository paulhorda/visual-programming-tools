public class Item {
    private final String name;
    private float price;


    public float getPrice(){
        return price;
    }
    public Item(String name, float price) {
        this.name = name;
        this.price = price > 0 ? price : 0;
    }

    public void downPriceForPercent(float percent) {
        if (isNegativeOrZerro(percent)) return;

        price -= price * percent / 100;

        if (isNegativeOrZerro(price)) price = 0;
    }

    public void upPriceForPercent(float percent) {
        if (isNegativeOrZerro(percent)) return;

        price += price * percent / 100;
    }

    private boolean isNegativeOrZerro(float value) {
        return value <= 0;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
