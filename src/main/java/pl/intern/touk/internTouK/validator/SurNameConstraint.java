package pl.intern.touk.internTouK.validator;

import org.hibernate.annotations.Target;
import pl.intern.touk.internTouK.validator.NameValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Constraint(validatedBy = SurNameValidator.class)
//@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface SurNameConstraint {
    String message() default "Invalid surname";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}