package pl.intern.touk.internTouK.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator <NameConstraint,String> {

    public void initialize(NameValidator constraintAnnotation) {

    }

    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext) {

        return Character.isUpperCase(name.codePointAt(0)) && name.length() >= 3 ;
    }
}
