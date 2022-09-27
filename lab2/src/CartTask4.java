import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CartTask4 {

    int currentIndex = 0;
    List<Item> listOfItems;


    public CartTask4(int maxListItems) {
        listOfItems = new ArrayList<>(maxListItems);
    }

    public boolean isCartFull() {
        return currentIndex == listOfItems.size();
    }

    public int getLengthOfCartItems() {
        return listOfItems.size();
    }

    @Override
    public String toString() {
        return "CartTask4{" +
                "listOfItems=" + listOfItems +
                '}';
    }

    public boolean isCartEmpty() {
        return listOfItems.size() == 0;
    }

    public double getSumOfCart() {
        double sum = 0;

        for (Item it : listOfItems) {
            sum += it.getPrice();
        }

        return sum;
    }

    public void push(Item item) {
        if (isCartFull()) return;
        listOfItems.add(item);
        currentIndex++;
    }

    public Item pop() {
        if (isCartEmpty()) return null;
        Item item = listOfItems.get(listOfItems.size() - 1);
        listOfItems.remove(--currentIndex);
        return item;
    }

    public void upItemsByPercent(float percent) {
        for (int i = 0; i < currentIndex; i++)
            listOfItems.get(i).upPriceForPercent(percent);
    }

    public void downItemsByPercent(float percent) {
        for (int i = 0; i < currentIndex; i++)
            listOfItems.get(i).downPriceForPercent(percent);
    }
}
