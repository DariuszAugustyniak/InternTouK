package pl.intern.touk.internTouK.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SurNameValidator implements ConstraintValidator<SurNameConstraint, String> {


    @Override
    public boolean isValid(String surname, ConstraintValidatorContext constraintValidatorContext) {
        if (surname.contains("-")) {
            if (Character.isUpperCase(surname.codePointAt(surname.indexOf("-") + 1))) {
                return Character.isUpperCase(surname.codePointAt(0)) && surname.length() >= 3;
            }
            return false;
        }
        return Character.isUpperCase(surname.codePointAt(0)) && surname.length() >= 3;
    }
}
