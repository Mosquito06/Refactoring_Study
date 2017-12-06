package kr.or.dgit.refactoring;

import java.util.ArrayList;
import java.util.List;

import kr.or.dgit.refactoring.statement.HtmlStatement;
import kr.or.dgit.refactoring.statement.TextStatement;

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

	public String statement() {
		return new TextStatement().value(this);
	}

	public String htmlStatement() {
		return new HtmlStatement().value(this);
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
