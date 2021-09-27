package forms;

import formtypes.FormType;

import java.util.ArrayList;
import java.util.List;

public class FormComposite extends Form {

    List<FormType> formTypes = new ArrayList<>();

    public void addFormType(FormType f) {
        formTypes.add(f);
    }

    @Override
    public double getArea() {
        double partialArea = 0.0;

        for (FormType f : formTypes) {
            partialArea += f.getArea();
        }

        return partialArea;
    }
}
