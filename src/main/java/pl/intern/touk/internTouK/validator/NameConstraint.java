package pl.intern.touk.internTouK.validator;



import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Constraint(validatedBy = NameValidator.class)

@Retention(RetentionPolicy.RUNTIME)
public @interface NameConstraint {
    String message() default "Invalid name";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}