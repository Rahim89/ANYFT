package com.springmvc.Validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = FieldsValueMatchValidator.class)
@Target ({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface FieldsValueMatch {
	
	String message() default "Fields values don't match!";
	
	Class<?> [] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	
	String field();
	
	String fieldMatch();
	
	@Target({ElementType.METHOD, ElementType.FIELD})
	@Retention(RetentionPolicy.RUNTIME)
	@interface List{
		FieldsValueMatch[] value();
	}

}
