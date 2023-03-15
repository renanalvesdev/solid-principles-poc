package pt.com.renan.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import pt.com.renan.rh.ValidationException;
import pt.com.renan.rh.model.Employee;

public class ValidationPercentAdjust implements ValidationAdjust{

	@Override
	public void validate(Employee employee, BigDecimal increase) {

		BigDecimal percentualReajuste = increase.divide(employee.getSalary(), RoundingMode.HALF_UP);

		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidationException("Reajuste nao pode ser superior a 40% do salario!");
		}
	}

}
