package formtypes;

public class Rectangle extends FormType {
    public Rectangle(double base, double height) {
        super.area = base * height;
    }
}
