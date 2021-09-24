package state;

import loja.Cart;
import loja.Product;

public abstract class CartState {
    protected Cart cart;
    protected CartState(Cart cart) {
        this.cart = cart;
    }

    public abstract void addProduct(Product p);
    public abstract void cancelCart();
    public abstract void undo();
    public abstract void next();
}
