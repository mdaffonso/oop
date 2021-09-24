package state;

import loja.Cart;
import loja.Product;

import java.util.ArrayList;

public class CartStateActive extends CartState {
    public CartStateActive(Cart cart) {
        super(cart);
    }

    @Override
    public void addProduct(Product p) {
        cart.getProducts().add(p);
        System.out.println("Produto adicionado ao carrinho: " + p.getName());
    }

    @Override
    public void cancelCart() {
        cart.setCartState(new CartStateEmpty(cart));
        System.out.println("Você esvaziou o seu carrinho.");
    }

    @Override
    public void undo() {
        ArrayList<Product> l = cart.getProducts();
        System.out.println("Você removeu o seguinte produto do seu carrinho: " + l.get(l.size() - 1).getName());
        if (l.size() == 0) {
            cancelCart();
        } else {
            l.remove(l.size() - 1);
        }
    }

    @Override
    public void next() {
        cart.setCartState(new CartStatePaying(cart));
    }
}
