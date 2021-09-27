import forms.Form;
import forms.FormComposite;
import forms.FormSimple;
import formtypes.Circle;
import formtypes.Rectangle;
import formtypes.Triangle;

public class Main {
    public static void main(String[] args) {
        Form cartA = new FormComposite();
        cartA.addFormType(new Rectangle(5.00, 4.00));
        for (int i = 0; i < 3; i++) {
            cartA.addFormType(new Circle(1.00));
        }

        Form locomotive = new FormComposite();
        locomotive.addFormType(new Rectangle(6.00, 4.00));
        locomotive.addFormType(new Triangle(2.00, 2.00));
        for (int i = 0; i < 2; i++) {
            locomotive.addFormType(new Circle(1.00));
        }

        Form caixa = new FormSimple();
        caixa.addFormType(new Rectangle(12.00, 4.00));

        System.out.println("Área total da locomotiva: " + locomotive.getArea() + " metros quadrados");
        System.out.println("Área total do vagão: " + cartA.getArea() + " metros quadrados");
        System.out.println("Área total da caixa: " + caixa.getArea() + " metros quadrados");
    }
}
