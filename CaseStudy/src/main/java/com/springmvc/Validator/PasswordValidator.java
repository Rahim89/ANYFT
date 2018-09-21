package com.springmvc.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<PasswordConstraint , String> {

	public static final Pattern VALID_PASSWORD = Pattern.compile("(?=.*\\d)(?=.*[A-Z])(?=.*[\\!\\@\\#\\$\\%\\^\\&\\*]).*$");
	
	public static boolean validate(String pwd) {
		Matcher matcher = VALID_PASSWORD.matcher(pwd);
		
		return matcher.find();
	}
	
	@Override
	public void initialize(PasswordConstraint constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		return (validate(value) && (value.length() >=6));
	}

}
