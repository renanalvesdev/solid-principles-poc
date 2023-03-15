package pt.com.renan.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import pt.com.renan.rh.ValidationException;

public class Employee {

	private String name;
	private String nif;
	private Position position;
	private BigDecimal salary;
	private LocalDate dateOflastSalaryAdjustment;


	public Employee(String name, String nif, Position position, BigDecimal salary) {
		this.name = name;
		this.nif = nif;
		this.position = position;
		this.salary = salary;
	}

	public void salaryAdjust(BigDecimal aumento) {
		this.salary = this.salary.add(aumento);
		this.dateOflastSalaryAdjustment = LocalDate.now();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public LocalDate getDateOflastSalaryAdjustment() {
		return dateOflastSalaryAdjustment;
	}

	public void setDateOflastSalaryAdjustment(LocalDate dateOflastSalaryAdjustment) {
		this.dateOflastSalaryAdjustment = dateOflastSalaryAdjustment;
	}


}
