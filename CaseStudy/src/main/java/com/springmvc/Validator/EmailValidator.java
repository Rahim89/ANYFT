package com.springmvc.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<EmailConstraint, String>{
	
public static final Pattern VALID_EMAIL = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	public static boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL.matcher(emailStr);
		
		return matcher.find();
	}

	@Override
	public void initialize(EmailConstraint constraintAnnotation) {
		
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		return (validate(value) && (value.length() > 8) && (value.length() < 14));
	}

}
