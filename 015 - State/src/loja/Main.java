package loja;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.next();
        cart.cancelCart();
        cart.undo();

        cart.addProduct(new Product("Coca-Cola 2l", 699));
        cart.addProduct(new Product("Arroz Tio João 1kg", 399));

        cart.undo();
        cart.next();

        cart.addProduct(new Product("Água Voss 675ml", 2750));
        cart.next();

        cart.undo();
        cart.next();

        cart.cancelCart();
    }
}
