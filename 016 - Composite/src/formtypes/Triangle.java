package formtypes;

public class Triangle extends FormType {
    public Triangle(double base, double height) {
        super.area = base * height / 2;
    }
}
