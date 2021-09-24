package loja;

import state.CartState;
import state.CartStateEmpty;

import java.util.ArrayList;

public class Cart {
    protected ArrayList<Product> products;
    protected CartState cartState;

    Cart() {
        this.cartState = new CartStateEmpty(this);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setCartState(CartState cartState) {
        this.cartState = cartState;
    }

    public void addProduct(Product p) {
        cartState.addProduct(p);
    }

    public void undo() {
        cartState.undo();
    }

    public void cancelCart() {
        cartState.cancelCart();
    }

    public void next() {
        cartState.next();
    }
}
