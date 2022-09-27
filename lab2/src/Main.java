public class Main {
    public static void main(String[] args) {
        Item item = new Item("Roman", 1234);
        System.out.println(item);
        item.downPriceForPercent(50);
        System.out.println(item);
        item.upPriceForPercent(50);
        System.out.println(item);



        Cart cart = new Cart(6);
        cart.push(new Item("Genry", 234));
        cart.push(new Item("Henru", 6565));
        cart.push(new Item("Josr", 34));
        cart.push(new Item("Asor", 7000));

        System.out.println("Sum of Cart: " + cart.getSumOfCart());
        cart.upItemsByPercent(15);
        System.out.println("Sum of Cart+15%: " + cart.getSumOfCart());
        cart.downItemsByPercent(30);
        System.out.println("Sum of Cart-30%: " + cart.getSumOfCart());
    }
}