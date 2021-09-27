package formtypes;

public class Circle extends FormType {
    public Circle(double radius) {
        super.area = radius * radius * Math.PI;
    }
}
