package forms;

import formtypes.FormType;

public class FormSimple extends Form {
    FormType formType;

    public void addFormType(FormType f) {
        formType = f;
    }

    @Override
    public double getArea() {
        return formType.getArea();
    }
}
