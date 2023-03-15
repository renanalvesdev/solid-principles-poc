package pt.com.renan.rh.service;

import java.math.BigDecimal;

import pt.com.renan.rh.model.Employee;

public interface ValidationAdjust {

	public void validate(Employee employee, BigDecimal increase);
	
}
