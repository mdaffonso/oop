package state;

import loja.Cart;
import loja.Product;

import java.util.ArrayList;

public class CartStateEmpty extends CartState {

    public CartStateEmpty(Cart cart) {
        super(cart);
        cart.setProducts(new ArrayList<>());
    }

    @Override
    public void addProduct(Product p) {
        cart.setCartState(new CartStateActive(cart));
        cart.getProducts().add(p);
        System.out.println("Produto adicionado ao carrinho: " + p.getName());
    }

    @Override
    public void cancelCart() {
        System.out.println("O carrinho já está vazio...");
    }

    @Override
    public void undo() {
        System.out.println("O carrinho já está vazio...");
    }

    @Override
    public void next() {
        System.out.println("O carrinho ainda está vazio. Adicione produtos antes de fazer o pagamento.");
    }
}
