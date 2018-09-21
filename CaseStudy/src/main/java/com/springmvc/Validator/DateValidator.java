package com.springmvc.Validator;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidator implements ConstraintValidator<DateConstraint, String>{
	
public static final Pattern VALID_DATE = Pattern.compile("[0-9]{2, },-[A-Z]{3, },-[0-9]{4, }", Pattern.CASE_INSENSITIVE);
	
	public static boolean validate(String testDate) {
		Matcher matcher = VALID_DATE.matcher(testDate);
		
		return matcher.find();
	}

	@Override
	public void initialize(DateConstraint constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return false;
	}

}
