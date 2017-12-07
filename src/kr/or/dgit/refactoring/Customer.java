package kr.or.dgit.refactoring;

import java.util.ArrayList;
import java.util.List;

import kr.or.dgit.refactoring.statement.ResultType;
import kr.or.dgit.refactoring.statement.StatementFactory;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String aName) {
		super();
		this.name = aName;
	}

	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}

	public String getName() {
		return name;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public String statement(ResultType isText) {
		return StatementFactory.getStatement(isText).value(this);
	}

	public double getTotalFrequentRenterPoints() {
		int result = 0;
		for (Rental rental : rentals) {
			result += rental.getFrequentRenterPoints();
		}
		return result;
	}

	public double getTotalCharge() {
		double result = 0;
		for (Rental rental : rentals) {
			result += rental.getCharge();
		}
		return result;
	}

}
