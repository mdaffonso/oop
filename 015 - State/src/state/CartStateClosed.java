package state;

import loja.Cart;
import loja.Product;

public class CartStateClosed extends CartState {
    public CartStateClosed(Cart cart) {
        super(cart);
        System.out.println("Compra concluída com sucesso! Obrigado por comprar conosco. :)");
    }

    private void showStandardMessage() {
        System.out.println("A compra já foi concluída.");
    }

    @Override
    public void addProduct(Product p) {
        showStandardMessage();
        System.out.println("Não é possível adicionar novos produtos.");
    }

    @Override
    public void cancelCart() {
        showStandardMessage();
        System.out.println("Não é mais possível cancelar o carrinho.");
    }

    @Override
    public void undo() {
        showStandardMessage();
        System.out.println("Não é possível voltar para a etapa anterior.");
    }

    @Override
    public void next() {
        cart.setCartState(new CartStateEmpty(cart));
    }
}
