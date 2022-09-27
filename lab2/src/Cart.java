import java.util.Arrays;

public class Cart {

    int currentIndex = 0;
    Item[] listOfItems;


    public Cart(int maxListItems) {
        listOfItems = new Item[maxListItems];
    }

    public boolean isCartFull() {
        return currentIndex == listOfItems.length;
    }

    public int getLengthOfCartItems() {
        return listOfItems.length;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "listOfItems=" + Arrays.toString(listOfItems) +
                '}';
    }

    public boolean isCartEmpty() {
        return listOfItems.length == 0;
    }

    public double getSumOfCart() {
        double sum = 0;

        for (int i = 0; i < currentIndex; i++) {
            sum+= listOfItems[i].getPrice();
        }

        return sum;
    }

    public void push(Item item) {
        if (isCartFull()) return;
        listOfItems[currentIndex++] = item;
    }

    public Item pop() {
        if (isCartEmpty()) return null;
        Item item = listOfItems[--currentIndex];
        listOfItems[currentIndex] = null;
        return item;
    }

    public void upItemsByPercent(float percent) {
        for (int i = 0; i < currentIndex; i++) {
            listOfItems[i].upPriceForPercent(percent);
        }
    }

    public void downItemsByPercent(float percent) {
        for (int i = 0; i < currentIndex; i++) {
            listOfItems[i].downPriceForPercent(percent);
        }
    }
}
