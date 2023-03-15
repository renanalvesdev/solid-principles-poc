package pt.com.renan.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import pt.com.renan.rh.ValidationException;
import pt.com.renan.rh.model.Employee;

public class ValidationPeriodicity implements ValidationAdjust{


	@Override
	public void validate(Employee employee, BigDecimal increase) {
		LocalDate dateLastAdjust = employee.getDateOflastSalaryAdjustment();
		LocalDate dateNow = LocalDate.now();
		
		long monthsSinceLastAdjust = ChronoUnit.MONTHS.between(dateLastAdjust, dateNow);
		
		if(monthsSinceLastAdjust < 6) {
			throw new ValidationException("Interval months should be greater than 6 !");
		}
	}
}
