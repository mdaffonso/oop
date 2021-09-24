package state;

import loja.Cart;
import loja.Product;

public class CartStatePaying extends CartState {
    public CartStatePaying(Cart cart) {
        super(cart);
        System.out.println("Iniciando pagamento...\n");
        System.out.println("Lista de produtos:");
        for (Product p : cart.getProducts()) {
            System.out.println("Produto: " + p.getName());
            System.out.println("Preço:   " + p.getFormattedPrice());
        }
        System.out.println("");
    }

    @Override
    public void addProduct(Product p) {
        System.out.println("Não é possível adicionar produtos durante o pagamento.");
    }

    @Override
    public void cancelCart() {
        cart.setCartState(new CartStateEmpty(cart));
        System.out.println("Compra cancelada.");
    }

    @Override
    public void undo() {
        cart.setCartState(new CartStateActive(cart));
        System.out.println("Carrinho aberto novamente.");
    }

    @Override
    public void next() {
        cart.setCartState(new CartStateClosed(cart));
    }
}
