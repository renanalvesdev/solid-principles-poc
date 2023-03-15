package pt.com.renan.rh.service;

import java.math.BigDecimal;
import java.util.List;

import pt.com.renan.rh.model.Employee;

public class AdjustService {

	private List<ValidationAdjust> validations;
	
	public AdjustService(List<ValidationAdjust> validations) {
		this.validations = validations;
	}
	
	public void adjust(Employee employee, BigDecimal increase) {
		validations.forEach(v -> v.validate(employee, increase));
		employee.salaryAdjust(increase);
	}
}
